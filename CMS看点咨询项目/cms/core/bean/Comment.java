package com.briup.cms.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 评论
 * @author nr
 *
 */
public class Comment implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 编号（主键）
	 */
	private Long id;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 评论时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date time;
	/**
	 * 评论人
	 */
	private User user;
	/**
	 * 评论的文章
	 */
	private Article article;
	/**
	 * 该评论所评论的评论
	 */
	private Comment comment;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", time=" + time + ", user=" + user + ", article="
				+ article + ", comment=" + comment + "]";
	}
	
}
