package com.hclab.model;

/**
 * 进行显示的item的实体类
 */
public class ItemCommonModel {
	private Integer id; // 需要进行显示item的icon的id
	private String name; // item的名字

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
