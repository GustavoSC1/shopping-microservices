package com.gustavo.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//Define como o Produto será persistido no Elasticsearch
@Document(indexName = "product", type = "catalog")
public class Product {
	
	@Id
	private Long id;
	private String name;
	private Integer amount;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
