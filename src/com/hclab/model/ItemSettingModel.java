package com.hclab.model;

/**
 * 设置列表中item的实体类
 */
public class ItemSettingModel {

	private String name; // 该项item的名字

	public ItemSettingModel() {
		super();
	}

	public ItemSettingModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemSettingModel [name=" + name + "]";
	}

}
