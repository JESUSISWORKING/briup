package com.briup.cms.bean;

import java.io.Serializable;
/**
 * 角色
 * @author nr
 *
 */
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 编号（主键）
	 */
	private Long id;
	/**
	 * 角色名
	 */
	private String name;
	/**
	 * 角色描述信息
	 */
	private String description;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
