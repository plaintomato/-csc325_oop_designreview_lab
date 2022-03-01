
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private double gpa;
    private int credits;
    
    public Student(String name, int age, int credits){
        super(name, age);
        if(credits < 0) throw new IllegalArgumentException("Credit requirements for class standing not met");
        else this.credits = credits;
    }
    
    @Override
    public String getAddress(){
        return address;
    }
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
    
    public int getCredits(){
        return credits;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
}