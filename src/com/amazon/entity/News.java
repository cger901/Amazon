package com.amazon.entity;

import java.util.Date;

/**
 * 新闻实体类
 * Field: newsId/title/content/create_time
 * @author cc
 */
public class News {
	private long newsId;
	private String title;
	private String content;
	private long create_time;
	
	public News(){}
	public News(String title, String content, Date create_time) {
		this.title = title;
		this.content = content;
		this.create_time = create_time.getTime();
	}
	public News(long newsId, String title, String content, Date create_time) {
		this.newsId = newsId;
		this.title = title;
		this.content = content;
		this.create_time = create_time.getTime();
	}
	
	public long getNewsId() {
		return newsId;
	}
	public void setNewsId(long newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreate_time() {
		return new Date(create_time);
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time.getTime();
	}
}
