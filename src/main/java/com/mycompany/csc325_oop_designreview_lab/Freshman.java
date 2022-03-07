package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
	public Freshman(String name, short age, int credits){
		super(name, age, (credits < 85 && credits > -1) ? credits:-1); //regular if cant work for a super, so ternary operator is required
	}
	public String toString(){
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address + "\n" + "Credits: " + credits + "\n" + "GPA: " + gpa + "\n";
	}
}
