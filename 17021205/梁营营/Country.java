package com.hashmap;

public class Country {

	//���ԣ�
	String name;
	long population;
	
	
	//�вεĹ��췽������
	public Country(String name, long population) {
		this.name = name;
		this.population = population;
	}


	//����toString������
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	
	
	
}
