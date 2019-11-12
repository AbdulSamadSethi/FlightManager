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
public class Ticket {
    private Passenger person;
    private Flight flight;
    private double price;
    private int tnumber;
    
    Ticket(Passenger p, Flight fl, double cost) {
        person = p;
        flight = fl;
        price = cost;
    }
    
    public Passenger getPassenger() {
        return person;
    }
    
    public Flight getFlight() {
        return flight;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getTicketNumber() {
        return tnumber;
    }
    
    public void setPassenger(Passenger p) {
        person = p;
    }
    
    public void setFlight(Flight fl) {
        flight = fl;
    }
    
    public void setPrice(double cost) {
        price = cost;
    }
    
    public void setTicketNumber(int t) {
        tnumber = t;
    }
    
    @Override
    public String toString() {
       return (person.getName() + " ,Flight Number: " + flight.getflightNumber() + " ,Origin: " + flight.getorigin() + " ,Destination: " + flight.getdestination() + " ,Departure Time: " + flight.getdepartureTime() + " ,Capacity: " + flight.getcapacity() + " ,Price: $" + flight.getoriginalPrice() + " ,Ticket Price: $" + price);
    }
    
    
}
