package com.webshop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.domain.Game;
import com.webshop.repository.GameRepository;
import com.webshop.service.GameService;

@Service
public class GameServiceImpl implements GameService{
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll() {
		List<Game> gameList = (List<Game>) gameRepository.findAll();
		List<Game> activeGameList = new ArrayList<>();
		
		for (Game game: gameList) {
			if(game.isActive()) {
				activeGameList.add(game);
			}
		}
		
		return activeGameList;
		
	
	}
	
	public Game findById (Long id) {
		return gameRepository.findById(id).orElse(null);
	}
	
	public List<Game> findByGenre(String genre){
		List<Game> gameList = gameRepository.findByGenre(genre);
		
		List<Game> activeGameList = new ArrayList<>();
		
		for (Game game: gameList) {
			if(game.isActive()) {
				activeGameList.add(game);
			}
		}
		
		return activeGameList;
	}
	
	public List<Game> blurrySearch(String title) {
		List<Game> gameList = gameRepository.findByTitleContaining(title);
		List<Game> activeGameList = new ArrayList<>();
		
		for (Game game: gameList) {
			if(game.isActive()) {
				activeGameList.add(game);
			}
		}
		
		return activeGameList;
	}
}


	


