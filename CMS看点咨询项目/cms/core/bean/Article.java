package com.briup.cms.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 文章
 * @author nr
 *
 */
public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 编号（主键）
	 */
	private Long id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 发布时间
	 */
	private Date publishTime;
	/**
	 * 状态（未审核，审核通过，审核失败）
	 */
	private String status;
	/**
	 * 阅读量
	 */
	private Long readTimes;
	/**
	 * 点赞数
	 */
	private Long thumbUp;
	/**
	 * 被踩数
	 */
	private Long thumbDown;
	/**
	 * 发布者
	 */
	private User user;
	/**
	 * 所属分类
	 */
	private Category category;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getReadTimes() {
		return readTimes;
	}
	public void setReadTimes(Long readTimes) {
		this.readTimes = readTimes;
	}
	public Long getThumbUp() {
		return thumbUp;
	}
	public void setThumbUp(Long thumbUp) {
		this.thumbUp = thumbUp;
	}
	public Long getThumbDown() {
		return thumbDown;
	}
	public void setThumbDown(Long thumbDown) {
		this.thumbDown = thumbDown;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", publishTime=" + publishTime
				+ ", status=" + status + ", readTimes=" + readTimes + ", thumbUp=" + thumbUp + ", thumbDown="
				+ thumbDown + ", user=" + user + ", category=" + category + "]";
	}
	

}
