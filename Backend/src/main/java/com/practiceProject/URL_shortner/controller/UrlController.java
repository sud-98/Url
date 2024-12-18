package com.practiceProject.URL_shortner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceProject.URL_shortner.model.Url;
import com.practiceProject.URL_shortner.service.UrlService;


@RestController
@RequestMapping("url/shortner")
public class UrlController {
	
	@Autowired
	private UrlService urlService;
	
	@GetMapping("{id}")
	public String getOriginalUrl(@PathVariable String id) {
		return urlService.getOriginalUrl(id);
	}
	
	@PostMapping
	public Url generateShortUrl(@RequestBody String url) {
		return urlService.generateShortUrl(url);
	}
}
