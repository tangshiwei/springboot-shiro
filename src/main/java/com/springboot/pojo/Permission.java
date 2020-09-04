package com.springboot.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permission implements Serializable{
	private Integer id;
	private String url;
	private String name;
	public Permission(){}
	public Permission(Integer id, String url, String name) {
		this.id = id;
		this.url = url;
		this.name = name;
	}
}
