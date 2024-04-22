package com.e_chem.parsingprom.elements;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
	@XmlElement(name = "id", namespace = "http://base.google.com/ns/1.0")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@XmlElement(name = "title", namespace = "http://base.google.com/ns/1.0")
	private String title;
	@XmlElement(name = "description", namespace = "http://base.google.com/ns/1.0")
	private String description;
//	@XmlElement(name = "link", namespace = "http://base.google.com/ns/1.0")
//	private String link;
//	@XmlElement(name = "ads_redirect", namespace = "http://base.google.com/ns/1.0")
//	private String ads_redirect;
	@XmlElement(name = "image_link", namespace = "http://base.google.com/ns/1.0")
	private String image_link;
//	@XmlElement(name = "additional_image_link", namespace = "http://base.google.com/ns/1.0")
//	private String additional_image_link;
	@XmlElement(name = "availability", namespace = "http://base.google.com/ns/1.0")
	private String availability;
	@XmlElement(name = "price", namespace = "http://base.google.com/ns/1.0")
	private String price;
//	@XmlElement(name = "product_type", namespace = "http://base.google.com/ns/1.0")
//	private String product_type;
	@XmlElement(name = "brand", namespace = "http://base.google.com/ns/1.0")
	private String brand;
//	@XmlElement(name = "identifier_exists", namespace = "http://base.google.com/ns/1.0")
//	private String identifier_exists;
//	@XmlElement(name = "condition", namespace = "http://base.google.com/ns/1.0")
//	private String condition;
//	@XmlElement(name = "color", namespace = "http://base.google.com/ns/1.0")
//	private String color;
//	@XmlElement(name = "product_detail", namespace = "http://base.google.com/ns/1.0")
//	private List<ProductDetail> productDetailList;


}