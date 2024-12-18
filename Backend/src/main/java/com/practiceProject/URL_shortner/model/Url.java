package com.practiceProject.URL_shortner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Url {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	private String shortUrl;
	private String originalUrl;
	/**
	 * @return the shortUrl
	 */
	public String getShortUrl() {
		return shortUrl;
	}
	/**
	 * @param shortUrl the shortUrl to set
	 */
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	/**
	 * @return the originalUrl
	 */
	public String getOriginalUrl() {
		return originalUrl;
	}
	/**
	 * @param originalUrl the originalUrl to set
	 */
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	@Override
	public String toString() {
		return "Url [id=" + id + ", shortUrl=" + shortUrl + ", originalUrl=" + originalUrl + "]";
	}
	
	
}
