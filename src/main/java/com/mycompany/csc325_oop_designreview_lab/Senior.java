package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
	public Senior(String name, short age, int credits){
		super(name, age, (credits > 84) ? credits:-1); //regular if cant work for a super, so ternary operator is required
	}
	public String toString(){
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address + "\n" + "Credits: " + credits + "\n" + "GPA: " + gpa + "\n";
	}
}
