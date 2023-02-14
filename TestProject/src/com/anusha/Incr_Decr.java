package com.anusha;

public class Incr_Decr {
	public void method1() {
		int a=10;
		int b=5;
		
		a++;//10(11)
		++a;//12
		b++;//5(6)
		++b;//7
		 System.out.println(a++ + ++a +a);//12(13) + 14 +14
		 System.out.println(++b + b++ + b);//8 + 8(9) + 9
		 System.out.println(++a + ++b + a + b);//15+10+15+10
		 System.out.println(a++ + b++ );//15+10
	}
	
	public void method2() {
      int a=10;
      int b=15;
      --a;
      a--;
      --b;
      b--;
      System.out.println();
      System.out.println(--a+--b+b--+a--+a+b);
      System.out.println();
	}
	public void method3() {
    for (int i = 1; i <=10; i++) {
    	
    	System.out.print(i++ + ",");//prints odd
    	//System.out.print(++i);//prints even
		
	}
	}
	public static void main(String[] args) {
		Incr_Decr a= new  Incr_Decr();
		a.method1();
		a.method2();
		a.method3();
	}

}
