package com.e_chem.parsingprom.ProductService;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductDetail {
	@XmlElement(name = "attribute_name", namespace = "http://base.google.com/ns/1.0")
	private String attribute_name;
	@XmlElement(name = "attribute_value", namespace = "http://base.google.com/ns/1.0")
	private String attribute_value;
}
