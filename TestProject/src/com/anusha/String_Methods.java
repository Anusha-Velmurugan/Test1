package com.anusha;

public class String_Methods {
public void method1() {
String a="Anusha Velmurugan";
String b="anusha velmurugan";
String c="";
String d="Anusha           ";
String e="anush@gmail.com";
//to find length
int len = a.length();
System.out.println("Length of a is:" +len);
//to check equal or not-case sensitive
boolean eq = a.equals(b);
System.out.println("a and b are equal:"+eq);
//equal or not -ignores case sensitive
boolean eqIg = a.equalsIgnoreCase(b);
System.out.println("a and b are equal:"+eqIg);
//prints everything in upper case
String uc = b.toUpperCase();
System.out.println("to upper case:"+ uc);
//prints everything in lower case
String lc = d.toLowerCase();
System.out.println("to lower case: "+ lc);
//checks the prefix
boolean sw = e.startsWith("anu");
System.out.println("e starts with anu:"+ sw);
//checks the suffix
boolean ew = e.endsWith(".com");
System.out.println("e ends with .com: "+ ew);
//checks whether the given value is present or not
boolean con = d.contains(" ");
System.out.println("d contains space:"+ con);
//gives the index
int io = e.indexOf(".");
System.out.println("index of . in e is:"+ io);
//if a letter is present multiple times it will give the index of the last one
int lio = a.lastIndexOf("a");
System.out.println("last index of a in a is:"+lio);
//gives the character at the index no:
char ca = b.charAt(10);
System.out.println("Character at 10 in b is:"+ca);
//replaces the letter
String rep = d.replace(a, e);
System.out.println("After replacing a with e in d is:"+rep);
//seperates the string and prints the content after seperated
String ss1 = d.substring(3);
System.out.println("d after using substring:"+ss1);
String ss2 = e.substring(3, 7);
System.out.println("e after using substring:"+ ss2);
//to check whether the string is empty or not
boolean emp = c.isEmpty();
System.out.println("e is empty:"+ emp);
//trims the xtra space
String t = d.trim();
System.out.println("d after using trim:"+t);
//splits the word
String[] sp = e.split("a");
System.out.println();
System.out.println("-------SPLIT------");
for (String s : sp) {
	System.out.println("e after using split:"+s);
}
	}
public static void main(String[] args) {
	String_Methods g=new String_Methods();
	g.method1();
}

}
