package com.anusha;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collection_Map {
public void method1() {
Map<Integer, String> a= new HashMap<>();
 a.put(1, "Anusha");
 a.put(2,"aasha");
 a.put(3, "sha");
 a.put(4, "aathini");
 System.out.println(a);
 System.out.println("Size of a:"+a.size());
 System.out.println("a contains sha:"+a.containsValue("sha"));
 System.out.println("a contains key 3:"+a.containsKey(3));
 Map<String, Integer> b= new LinkedHashMap<>();
 b.put("maths", 98);
 b.put("Science", 100);
 b.put("social", 94);
 b.put("tamil", 96);
  System.out.println("---------------------------");
  System.out.println(b);
  System.out.println(b.keySet());
  System.out.println(b.entrySet());
 Map<String,Boolean> c= new TreeMap<>();
 c.put("AA", true);
 c.put("BB", false);
 c.put("CC", true);
 System.out.println("---------------------------------");
 System.out.println(c);
 System.out.println(c.values());
	}
public static void main(String[] args) {
	Collection_Map d= new Collection_Map();
	d.method1();
}
}
