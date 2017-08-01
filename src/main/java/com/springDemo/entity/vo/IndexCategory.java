package com.springDemo.entity.vo;

import com.springDemo.entity.SecondCategory;

import java.io.Serializable;
import java.util.List;

/**
 * 页面显示实体类
 */
public class IndexCategory implements Serializable{

	private String cid;
	private List<SecondCategory> categoryList;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public List<SecondCategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<SecondCategory> categoryList) {
		this.categoryList = categoryList;
	}
}
