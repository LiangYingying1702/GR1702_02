package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		//����key;
		Country china = new Country("�й�", 15);
		Country india = new Country("ӡ��", 13);
		Country japan = new Country("�ձ�", 2);
		
		//����value;
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		
		 //ͨ��key�õ�value;
		String string = hashMap.get(china);
		System.out.println(string);
		
		String string1 = hashMap.get(india);
		System.out.println(string1);
		
		String string2 = hashMap.get(japan);
		System.out.println(string2);
		
		
		//ͨ����������key�õ�value;
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(entry.toString());
			
		}
	}

}
