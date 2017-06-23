package com.amazon.entity;

/**
 * 商品类别实体类
 * Field: categoryId/categoryName/categoryParentId
 * @author cc
 */
public class Category {
	private long categoryId;		// Primary Key
	private String categoryName;	// Unique
	private long categoryParentId;	// Default 0
	
	public Category(){}
	public Category(String categoryName, long categoryParentId) {
		this.categoryName = categoryName;
		this.categoryParentId = categoryParentId;
	}
	public Category(long categoryId, String categoryName, long categoryParentId) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryParentId = categoryParentId;
	}
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public long getCategoryParentId() {
		return categoryParentId;
	}
	public void setCategoryParentId(long categoryParentId) {
		this.categoryParentId = categoryParentId;
	}
	
}
