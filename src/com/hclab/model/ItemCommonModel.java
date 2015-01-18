package com.hclab.model;

/**
 * ������ʾ��item��ʵ����
 */
public class ItemCommonModel {
	private Integer id; // ��Ҫ������ʾitem��icon��id
	private String name; // item������

	public ItemCommonModel() {
		super();
	}

	public ItemCommonModel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemModel [id=" + id + ", name=" + name + "]";
	}

}
