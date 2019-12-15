package com.webshop.service;

import java.util.List;
import java.util.Optional;

import com.webshop.domain.Game;

public interface GameService {
	
	List<Game> findAll ();
	
	Game findById(Long id);
	
	List<Game> findByGenre(String genre);
	
	List<Game> blurrySearch(String title);
	

}
