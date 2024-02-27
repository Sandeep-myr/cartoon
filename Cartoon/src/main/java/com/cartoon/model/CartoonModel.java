package com.cartoon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cartoon_Table")
public class CartoonModel {
	@Id
	@SequenceGenerator(name = "cartoon_sequence", sequenceName = "cartoon_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartoon_sequence")
	private Long cartoonId;
	private String cartoonName;
	private String description;
	private String category;
	private String genre;
	private String origin;
	private String imgUrl;
	private String websiteLink;
	private String gifUrl;
	

	public Long getCartoonId() {
		return cartoonId;
	}

	public void setCartoonId(Long cartoonId) {
		this.cartoonId = cartoonId;
	}

	public String getCartoonName() {
		return cartoonName;
	}

	public void setCartoonName(String cartoonName) {
		this.cartoonName = cartoonName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getGifUrl() {
		return gifUrl;
	}

	public void setGifUrl(String gifUrl) {
		this.gifUrl = gifUrl;
	}

	

}