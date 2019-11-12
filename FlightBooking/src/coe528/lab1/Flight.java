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
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private static int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;   
    
    Flight(int fnumber, String start, String finish, String time, int cap, double price) {
       //add IllegalArgumentException when comparing origin to destination
       if(start.equals(finish)) {
           throw new IllegalArgumentException("The origin and destination cannot be the same.");
       }
       flightNumber = fnumber;
       origin = start;
       destination = finish;
       departureTime = time;
       capacity = cap;
       originalPrice = price;
       
       numberOfSeatsLeft = cap--;
       
    }
    
    public void setflightNumber(int fnumber) {
        flightNumber = fnumber;
    }
    
    public void setorigin(String start) {
        origin = start;
    }

    public void setdestination(String finish) {
        destination = finish;
    }
    
    public void setdepartureTime(String time) {
        departureTime = time;
    }
    public void setcapacity(int cap) {
        capacity = cap;
    }
    
    public void setoriginalPrice(double price) {
        originalPrice = price;
    }
    
    public void setnumberOfSeatsLeft(int Left) {
        numberOfSeatsLeft = Left;
    }
    
    public int getflightNumber() {
        return flightNumber;
    }
    
    public String getorigin() {
        return origin;
    }

    public String getdestination() {
        return destination;
    }
    
    public String getdepartureTime() {
        return departureTime;
    }
    
    public int getcapacity() {
        return capacity;
    }
    
    public double getoriginalPrice() {
        return originalPrice;
    }
    
    public int getnumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }
  
    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
           numberOfSeatsLeft--;
           return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return ("Flight Number: " + flightNumber + " ,Origin: " + origin + " ,Destination: " + destination + " ,Departure Time: " + departureTime + " ,Capacity: " + capacity + " ,Price: $" + originalPrice); 
    }

}