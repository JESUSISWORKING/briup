package com.briup.cms.bean;

import java.io.Serializable;
/**
 * 文章分类
 * @author nr
 *
 */
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	  *    编号（主键）
	 */
	private Long id;
	/**
	 *  分类名
	 */
	private String name;
	/**
	 *  分类描述信息
	 */
	private String description;
	/**
	 * 分类序号（将来可以通过序号值改变分类的排序）
	 */
	private Long no;
	/**
	 * 当前分类所属一级分类对象（如果没有则为null）
	 */
	private Category category;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String name, String description, Long no, Category category) {
		super();
		this.name = name;
		this.description = description;
		this.no = no;
		this.category = category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", no=" + no + ", category="
				+ category + "]";
	}
	
}
