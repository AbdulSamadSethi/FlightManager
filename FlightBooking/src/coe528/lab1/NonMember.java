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
public class NonMember extends Passenger{
    
    NonMember(String n, int a) {
        super(n,a);
    }
    
    @Override 
    public double applyDiscount(double p) {
        if(super.getAge() > 65) {
          return p*0.9;
        }
        else {
            return p;
        }
    }
}
