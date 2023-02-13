package com.anusha;

public class Method_Ovrld {
	public void bioData() {
		System.out.println("		BIO-DATA		");
		System.out.println("------------------------------------------------");

	}
	public void bioData(String name,String qualifi) {
		name="Aathi Velmurugan";
		qualifi="M.B.B.S";
		System.out.println("Name          :"+name);
		System.out.println("Qualification :"+qualifi);
		
	}
	public void bioData(int by,int age) {
		by=2003;
		age=20;
		System.out.println("Year of Birth   :"+by);
		System.out.println("Age             :"+age);
		
	}
	public void bioData(String email,long mbl) {
		email="aathi@gmail.com";
		mbl=6384341213l;
		System.out.println("email      :"+email);
		System.out.println("contact    :"+mbl);
		
	}
	public static void main(String[] args) {
		Method_Ovrld a= new Method_Ovrld();
		a.bioData();
		a.bioData("aa", "bb");
		a.bioData(2, 3);
		a.bioData("cc",1234567891l);
	}

}
