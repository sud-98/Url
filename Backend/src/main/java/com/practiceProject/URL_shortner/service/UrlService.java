package com.practiceProject.URL_shortner.service;

import static com.practiceProject.URL_shortner.utilityservice.GenerateShortUrl.getShortUrl;
import static com.practiceProject.URL_shortner.utilityservice.GenerateShortUrl.isUrlValid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practiceProject.URL_shortner.model.Url;
import com.practiceProject.URL_shortner.repository.UrlRepository;;



@Service
public class UrlService {
	
	@Autowired
	private UrlRepository urlRepository;

	public String getOriginalUrl(String id) {
		return urlRepository.findByShortUrl(id);
	}

	public Url generateShortUrl(String url) {
		if(!isUrlValid(url)) {
			System.out.println("Inavlid Url");
			return null;
		}
		
		Url urlObj = new Url();
		urlObj.setOriginalUrl(url);
		urlObj.setShortUrl(getShortUrl(url));
		return urlRepository.save(urlObj);
	}
}
