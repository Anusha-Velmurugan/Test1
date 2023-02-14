package com.anusha;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
public void method1()  {
	Set<Object> a= new HashSet<>();
	a.add("pooja");
	a.add("athulya");
	a.add(100);
	a.add(97.5);
	System.out.println(a);
	Set<Object> b= new LinkedHashSet<>();
	b.add("anusha");
	b.add("aarthy");
	b.add("aathi");
	b.add(200);
	b.add('c');
	System.out.println("-----------------------------");
	System.out.println(b);
	Set<Object> c= new TreeSet<>();
	//c.add(1);
	//c.add(22);
	c.add("vel");
	c.add("jaya");
	System.out.println("------------------------------");
	System.out.println(c);
}
public static void main(String[] args)  {
	Collection_Set e= new Collection_Set();
	e.method1();
}
}
