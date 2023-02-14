package com.anusha;

public class Exception_tf {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} finally {
		System.out.println("System Error");
	}
	System.out.println("Hello");
}

}
