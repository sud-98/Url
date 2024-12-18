package com.practiceProject.URL_shortner.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practiceProject.URL_shortner.model.Url;

public interface UrlRepository extends JpaRepository<Url, Integer>{

	@Query(value = "select original_url from Url where short_url = ?1", nativeQuery = true)
	String findByShortUrl(String id);

}
