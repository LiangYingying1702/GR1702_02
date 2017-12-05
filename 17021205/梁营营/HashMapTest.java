package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		//编造key;
		Country china = new Country("中国", 15);
		Country india = new Country("印度", 13);
		Country japan = new Country("日本", 2);
		
		//编造value;
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		
		 //通过key得到value;
		String string = hashMap.get(china);
		System.out.println(string);
		
		String string1 = hashMap.get(india);
		System.out.println(string1);
		
		String string2 = hashMap.get(japan);
		System.out.println(string2);
		
		
		//通过迭代器由key得到value;
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(entry.toString());
			
		}
	}

}
