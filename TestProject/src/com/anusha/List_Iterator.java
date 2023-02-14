package com.anusha;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
	public void method1() {
	List<Object> a= new LinkedList<>();
	a.add("Anush");
	a.add("Ansha");
	a.add("Anshae");
	
	ListIterator<Object> b = a.listIterator();
	System.out.println("----------FORWARD DIRECTION---------------");
	while (b.hasNext()) {
		System.out.println(b.next());
	}
	System.out.println("---------------BACKWARD DIRECTION---------------");
	while (b.hasPrevious()) {
		System.out.println(b.previous());
	}
	}
public static void main(String[] args) {
	List_Iterator a= new List_Iterator();
	a.method1();
}
}
