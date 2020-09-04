package com.springboot.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable{

	private Integer id;
	private String name;
	private String memo;
	public Role(){}
	public Role(Integer id, String name, String memo) {
		this.id = id;
		this.name = name;
		this.memo = memo;
	}
}
