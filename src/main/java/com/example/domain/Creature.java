package com.example.domain;

public class Creature {
	/** 名前 */
	private String name;
	/** 属性 */
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Creature [name=" + name + ", type=" + type + "]";
	}
	
	

}
