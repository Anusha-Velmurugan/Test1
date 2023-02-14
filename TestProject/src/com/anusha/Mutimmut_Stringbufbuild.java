package com.anusha;

public class Mutimmut_Stringbufbuild {
public void immutableString() {
		String s="Anusha";
		String s1="Anusha";
		String s2="Vja";
//Immutable-memory will be shared incase of duplicate values
//new memory created incase of concatenation
System.out.println(s==s1);
//to check the memory shared or not incase of duplicate values using identityhashCode
System.out.println("---------------------------------------------------");
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));
//to check new memory created while concatenating
System.out.println("----------------------------------------------------");
s=s1+s2;
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s1));
//a==b is true while directly using syso, a==b is false when called using object
String s3=new String("Anusha");
String s4=new String("Anusha");
System.out.println("---------------------------------------------------------");
System.out.println(s3==s4);
	}
public void mutableString() {
//types-String Buffer,string Builder
	StringBuffer sb=new StringBuffer("Aathi");
	StringBuffer sb1=new StringBuffer("Aathi");
	StringBuffer sb2 =new StringBuffer("Sankar");
//a==b is true while directly using syso, a==b is false when called using object
	System.out.println("----------------MUTABLE--------------------------");
	System.out.println(sb==sb1);
//new memory created in case of duplicate values
System.out.println("------------------------------");
System.out.println(System.identityHashCode(sb));
System.out.println(System.identityHashCode(sb1));
System.out.println(System.identityHashCode(sb2));
//append is used to concatenate value in mutable string
//both append and concatenating are same
//memory shared while concatenating
sb1=sb1.append(sb2);
System.out.println("----------------------------------------------------");
System.out.println(sb1);
System.out.println(System.identityHashCode(sb1));

}
	public static void main(String[] args) {
		Mutimmut_Stringbufbuild a= new Mutimmut_Stringbufbuild();
		a.immutableString();
		a.mutableString();
	}

}
