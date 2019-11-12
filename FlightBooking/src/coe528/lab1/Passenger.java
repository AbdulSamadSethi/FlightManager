/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author abdul
 */
public abstract class Passenger {
    private String name;
    private int age;
    
    Passenger(String n, int a) {
        name = n;
        age = a; 
    }
    
    public String getName() {
       return name;
    }
    
    public int getAge() {
       return age;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    public abstract double applyDiscount(double p);
     
}
