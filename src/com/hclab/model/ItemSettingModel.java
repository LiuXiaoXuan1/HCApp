package com.hclab.model;

/**
 * �����б���item��ʵ����
 */
public class ItemSettingModel {

	private String name; // ����item������

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
