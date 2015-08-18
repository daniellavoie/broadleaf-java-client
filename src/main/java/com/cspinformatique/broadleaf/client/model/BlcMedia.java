package com.cspinformatique.broadleaf.client.model;


public class BlcMedia {
	private Long id;
	private String url;
	private String title;
	private String altText;
	private String tags;
	
	public BlcMedia(){
		
	}

	public BlcMedia(Long id, String url, String title, String altText,
			String tags) {
		this.id = id;
		this.url = url;
		this.title = title;
		this.altText = altText;
		this.tags = tags;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
}
