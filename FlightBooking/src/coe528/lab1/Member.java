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
public class Member extends Passenger {
    private int yearsOfMembership;
    
    Member(String n, int a, int y) {
        super(n,a);
        this.yearsOfMembership = y;
    }
    
    @Override
    public double applyDiscount(double p) {
        if(yearsOfMembership > 5) {
            return p*0.5;
        }
        else if(yearsOfMembership <= 5 & yearsOfMembership > 1){
            return p*0.9;
        }
        else {
            return p;
        }
    }
}