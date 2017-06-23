package com.amazon.entity;

/**
 * 商品实体类
 * Field: productId/productName/description/price/stock/categoryId/categoryChildId/filePath
 * @author cc
 */
public class Product {
	private long productId;			// Primary Key
	private String productName;		// Not Null
	private String description;
	private double price;			// Default 0
	private long stock;				// Default 0
	private long categoryId;		// Foreign Key
	private long categoryChildId;	// Foreign Key
	private String filePath;		// Not Null
	
	public Product(){}
	public Product(String productName, String description, double price, long stock, long categoryId,
			long categoryChildId, String filePath) {
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.categoryId = categoryId;
		this.categoryChildId = categoryChildId;
		this.filePath = filePath;
	}
	public Product(long productId, String productName, String description, double price, long stock, long categoryId,
			long categoryChildId, String filePath) {
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.categoryId = categoryId;
		this.categoryChildId = categoryChildId;
		this.filePath = filePath;
	}
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public long getCategoryChildId() {
		return categoryChildId;
	}
	public void setCategoryChildId(long categoryChildId) {
		this.categoryChildId = categoryChildId;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
