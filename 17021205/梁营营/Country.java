package com.hashmap;

public class Country {

	//属性；
	String name;
	long population;
	
	
	//有参的构造方法法；
	public Country(String name, long population) {
		this.name = name;
		this.population = population;
	}


	//创建toString方法；
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	
	
	
}
