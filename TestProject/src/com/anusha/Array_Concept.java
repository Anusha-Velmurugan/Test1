package com.anusha;

public class Array_Concept {
	public void method1() {
   int a[]=new int[5];
   a[0]=1;
   a[1]=2;
   a[2]=3;
   a[3]=4;
   a[4]=5;
   System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
   System.out.println();
   for (int i = 0; i < a.length; i++) {
	   System.out.println(a[i]);
	
}
	}
public void method2() {
   int a[]= {1,2,3,4,5,6,7,8,9,10};
   System.out.println("For Loop");
   System.out.println("-------------------------------------------------------");
   for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	   System.out.println("Length of the Array a is: "+a.length);
	   System.out.println("For Each ");
	   System.out.println("----------------------------------------------");
   for (int n : a) {
	System.out.println(n);
}
	   String b[]=new String[3];
    b[0]="Anu";
    b[1]="Aathi";
    b[2]="Rio";
    System.out.println();
    System.out.println("For Each:");
    System.out.println("-------------------------------------------------------");
  for (String name : b) {
	System.out.println(name);
}
  
	}
public static void main(String[] args) {
	Array_Concept a= new Array_Concept();
	a.method1();
	a.method2();
}
}
