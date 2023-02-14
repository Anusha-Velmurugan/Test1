package com.anusha;

public class For_Loop_Basics {
	public void method1() {
  for (int i = 0; i <=10; i++) {
	  System.out.print(i);
	  System.out.println();
}
	}
	public void method2() {
		int size = 3;
    for (int i = 1; i <=size; i++) {
    	System.out.println("Set:"+i);
    	System.out.println("============");
    	for (int j =1; j <=size; j++) {
    		System.out.print(i);	
		}
    	System.out.println();
}
	}
	public void method3() {
for (int i = 1; i < 3; i++) {
	System.out.println("Set:"+i);
	System.out.println("============");
	for (int j = 1; j < 3; j++) {
	 for (int k = 0; k < 3; k++) {
		System.out.print(i+j+k);
		System.out.print(i*j*k);
		System.out.println();
	}	
	}
}
	}
	public static void main(String[] args) {
		For_Loop_Basics a= new For_Loop_Basics();
		a.method1();
		a.method2(); 
		a.method3();
	}

}
