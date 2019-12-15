package com.webshop.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webshop.domain.Game;
import com.webshop.domain.User;
import com.webshop.service.GameService;
import com.webshop.service.UserService;



@Controller
public class SearchController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private GameService gameService;

	@RequestMapping("/searchByGenre")
	public String searchByGenre(
			@RequestParam("genre") String genre,
			Model model, Principal principal
			){
		if(principal!=null) {
			String username = principal.getName();
			User user = userService.findByUsername(username);
			model.addAttribute("user", user);
		}
		
		String classActiveGenre = "active"+genre;
		classActiveGenre = classActiveGenre.replaceAll("\\s+", "");
		classActiveGenre = classActiveGenre.replaceAll("&", "");
		model.addAttribute(classActiveGenre, true);
		
		List<Game> gameList = gameService.findByGenre(genre);
		
		if (gameList.isEmpty()) {
			model.addAttribute("emptyList", true);
			return "gameshelf";
		}
		
		model.addAttribute("gameList", gameList);
		
		return "gameshelf";
	}
	
	@RequestMapping("/searchGame")
	public String searchGame(
			@ModelAttribute("keyword") String keyword,
			Principal principal, Model model
			) {
		if(principal!=null) {
			String username = principal.getName();
			User user = userService.findByUsername(username);
			model.addAttribute("user", user);
		}
		
		List<Game> gameList = gameService.blurrySearch(keyword);
		
		if (gameList.isEmpty()) {
			model.addAttribute("emptyList", true);
			return "gameshelf";
		}
		
		model.addAttribute("gameList", gameList);
		
		return "gameshelf";
	}
}
