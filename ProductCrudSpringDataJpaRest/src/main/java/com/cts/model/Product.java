package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "products_info")
@Data
public class Product {
	@Id
	@Column(name = "pid")
	@GeneratedValue
	private int productId;
	@NotBlank(message="ProductName can't be NULL or BLANK")
//	@NotNull
	private String productName;
	@Column(name = "price")
	@Min(value=100,message="ProductPrice must be above 100")
//  @Max(value=100000)
	private int productPrice;
	@Size(min=5,max=12,message="category should be valid")
	private String productCategory;
	private int productQuantity;

	public Product() {
		System.out.println("Default");
	}

	public Product(String productName, int productPrice, String productCategory, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}

	
}
