/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {
		short age = 20; //it assumes int when plugged in directly
		Student std1= new Freshman("James", age, 12); // name, age, credits
		age = 30;                
                Student std2 = new Senior("John", age, 90);

                Scanner scanner = new Scanner(System.in); //create the scanner to get user input
                System.out.println("Enter the GPA for " + std1.getName());
                std1.setGPA(scanner.nextDouble());
                System.out.println("Enter the GPA for " + std2.getName());
                std2.setGPA(scanner.nextDouble()); //GPA is double type
		System.out.println(std1.toString());
		System.out.println(std2.toString());
                scanner.close(); //close the scanner when we are done
	}

}
