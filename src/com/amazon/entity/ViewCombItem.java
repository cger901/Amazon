package com.amazon.entity;

import java.util.HashMap;

public class ViewCombItem {
	private Product product;
	private HashMap<String, String> title;
	private String category;
	private String tag;
	private String more;
	private String url;
	
	public ViewCombItem() {}
	public ViewCombItem(Product product) {
		this.product = product;
	}
	public ViewCombItem(HashMap<String, String> title) {
		this.title = title;
	}
	public ViewCombItem(String category, String tag, String more, String url) {
		this.category = category;
		this.tag = tag;
		this.more = more;
		this.url = url;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public HashMap<String, String> getTitle() {
		return title;
	}
	public void setTitle(HashMap<String, String> title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getMore() {
		return more;
	}
	public void setMore(String more) {
		this.more = more;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isImage() {
		return product != null;
	}
	public boolean isTitle() {
		return title != null;
	}
	public boolean isCategory() {
		return category != null && tag != null && more != null && url != null;
	}
}
