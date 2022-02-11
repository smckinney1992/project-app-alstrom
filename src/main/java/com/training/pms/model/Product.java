package com.training.pms.model;

//MODEL or POJO
public class Product {
	private int productId;
	private String productName;
	private int quanityOnHand;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String productName, int quanityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quanityOnHand = quanityOnHand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuanityOnHand() {
		return quanityOnHand;
	}

	public void setQuanityOnHand(int quanityOnHand) {
		this.quanityOnHand = quanityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quanityOnHand=" + quanityOnHand
				+ ", price=" + price + "]";
	}
	
	
	
}
