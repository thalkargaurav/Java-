package com.jsp.maps;

import java.util.HashMap;
import java.util.Map;

public class StudentHash_Map {
	public static void main(String[] args) {
		Map<Integer,Student> map=new HashMap<>();
		map.put(102, new Student(1024, "Virat", "virat@mail.com"));
		map.put(203, new Student(203, "Rohit", "rohit@mail.com"));
		map.put(8, new Student(8, "rahul", "rahul@mail.com"));
		map.put(500, new Student(500, "samay", "samay@mail.com"));

		System.out.println(map);
		
	}

}
