package com.anusha;

public class Matrix_Dimension {
public void method1() {
int a[][][]=new int[3][3][3];
 a[0][0][0]=2;
 a[0][0][1]=4;
 a[1][0][0]=6;
 a[1][1][1]=8;
 a[0][1][0]=10;
 a[0][1][1]=12;
 for (int i = 0; i < a.length; i++) {
	 for (int j = 0; j < a.length; j++) {
		 for (int k = 0; k < a.length; k++) {
			 System.out.print(a[i][j][k]+" ");
			
		}
		 System.out.println();
	}
}
 }
public static void main(String[] args) {
	Matrix_Dimension b=new Matrix_Dimension();
	b.method1();
}
}
