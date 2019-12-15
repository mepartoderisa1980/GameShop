package com.webshop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webshop.domain.Game;

public interface GameRepository extends CrudRepository<Game,Long>  {

	List<Game> findByGenre(String genre);
	
	List<Game> findByTitleContaining(String title);

}
