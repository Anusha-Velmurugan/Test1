package com.anusha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_List {
	public void method1() {
		List<Object> a= new ArrayList<>();
		a.add(78);
		a.add("anu");
		a.add(0.01);
		a.add('a');
		
		List<Object> b=new LinkedList<>();
		b.add(78);
		b.add(0.01);
		b.add("aathi");
		b.add('b');
		
		List<Object> c= new Vector<>();
		c.add("akalya");
		c.add("abarna");
		c.add("abitha");
		c.add("giri");
		c.add("dharani");
		c.add("square");
		for (Object d : c) {
			System.out.println(d);
		}
		//methods 
		System.out.println("-------------------------------------");
		System.out.println("Size of a is:"+a.size());
		System.out.println("Variable at the index 2 is:"+ b.get(2));
		System.out.println("------------------------------------");
		a.set(1, "aathi");
		System.out.println(a);
		System.out.println("----------------------------------------");
		b.add(2,"anu");
		System.out.println(b);
		System.out.println("------------------------------------------");
		b.remove(3);
		System.out.println(b);
		System.out.println("----------------------------------------");
		System.out.println("Index of 0.01 is:"+ a.indexOf(0.01));
		System.out.println("a contains 78:"+ a.contains(78));
		System.out.println("------------RETAIN ALL---------------");
		a.retainAll(b);
		System.out.println(a);
		System.out.println("------------------------REMOVE ALL--------------------");
		b.removeAll(a);
		System.out.println(b);
		System.out.println("--------------------------ADD ALL-------------------");
		a.addAll(b);
		System.out.println(a);
		System.out.println("-------------CLEAR-------------------");
		a.clear();
		System.out.println(a);
		b.clear();
		System.out.println(b);
	}
public static void main(String[] args) {
	Collection_List cl = new Collection_List();
	cl.method1();
}
}
