/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Abdul Samad Sethi
 * student id: 500831619
 */

import java.util.ArrayList;

public class Manager {
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;
    
    Manager(ArrayList<Flight> fl, ArrayList<Ticket> tick) {
        this.flights = fl;
        this.tickets = tick;
    }
    
    public void createFlights() {
        
        flights.add(new Flight(13030,"Toronto","Paris","4:00",300,1000.00));
        flights.add(new Flight(14020,"Toronto","Berlin","5:00",200,1100.00));
        flights.add(new Flight(15120,"Toronto","California","2:30",500,900.00));
        flights.add(new Flight(19070,"Toronto","Islamabad","4:30",200,1100.00));
        flights.add(new Flight(13600,"Toronto","Athens","3:00",400,1500.00));
        flights.add(new Flight(17040,"Toronto","Stockholm","6:00",500,1200.00));
        flights.add(new Flight(16040,"Toronto","Cairo","11:00",700,2200.00));
        flights.add(new Flight(13050,"Toronto","New Delhi","12:30",400,2300.00));
        flights.add(new Flight(12030,"Toronto","New York","5:30",100,150.00));
        flights.add(new Flight(15320,"Toronto","Multan","1:30",500,1700.00));
        flights.add(new Flight(11230,"Toronto","Tokyo","9:30",300,1500.00));
        
    }
    
    public void displayAvailableFlights(String origin, String destination) {
        for(int i = 0; i < flights.size(); i++) {
            if(flights.get(i).getorigin().equals(origin)) {
                if(flights.get(i).getdestination().equals(destination)) {
                    System.out.println(flights.get(i).toString());
                }
            }
        }
    }
    
    public Flight getflight(int flightNumber) {
        for(int i = 0; i < flights.size(); i++) {
            if(flights.get(i).getflightNumber() == flightNumber) {
                return flights.get(i);
            }
        }
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p) {
        if(flights.contains(this.getflight(flightNumber))) {
            if(this.getflight(flightNumber).bookASeat() == true) {
                this.getflight(flightNumber).bookASeat();
                System.out.println("Your seat has been booked, Have a good trip!");
                tickets.add(new Ticket(p,this.getflight(flightNumber),this.getflight(flightNumber).getoriginalPrice()));
                tickets.get(tickets.size()-1).setPrice(p.applyDiscount(this.getflight(flightNumber).getoriginalPrice()));
                System.out.println(tickets.get(tickets.size()-1));
            }   
            else {
                System.out.println("The flight is fully booked.");
            } 
        }
        else {
            System.out.println("The flight cannot be found.");
        }
    }
    
    public void displayallflights() {
       System.out.println("All available flights:");
       for(int i = 0; i < flights.size(); i++) {
           System.out.println(flights.get(i).toString());
       }
    }
    
    public static void main(String[] args) {
        
        //Creating two new empty arraylists of flights and tickets
        ArrayList<Flight> fl = new ArrayList<>();
        ArrayList<Ticket> t = new ArrayList<>();
        
        //Creating a set of passenger to test the Member and NonMember class.
        Passenger p1 = new Member("Dave", 40, 10);
        Passenger p2 = new Member("Elliot", 45, 4);
        Passenger p3 = new NonMember("Larry", 82);
        Passenger p4 = new NonMember("Megan", 20);
        
        
        //creating two new static flights objects
        Flight f1 = new Flight(13500,"Toronto", "Rome", "7:30", 7, 2000.00);
        Flight f2 = new Flight(12400,"Toronto", "Moscow", "3:00", 300, 1800.00);
        
        //then adding those two flight objects to the arraylist called fl
        fl.add(f1);
        fl.add(f2);
        
        //Creating  new manager object
        Manager m = new Manager(fl, t);
        
        //Filling manager object with flights
        m.createFlights();
        
        //Display all available flights on the flightbooking system
        m.displayallflights();
        System.out.println(); // for spacing
        
        //Displaying all available flights from selected origin to selected destination
        m.displayAvailableFlights("Toronto", "Rome");
           
        //Testing getflight method by putting in a given flight number from the array
        System.out.println("\nThe Flight with the specified flight number:");
        System.out.println(m.getflight(13500));
        
        //Testing the bookseat method by testing 6 different cases
        m.bookSeat(13500, p1);                                      //When passenger is a member for more than 5 years
        m.bookSeat(13500, p2);                                     //When passenger is member for less than 5 years
        m.bookSeat(13500, p3);                                    //When passenger is nonMember and older than 65
        m.bookSeat(13500, p4);                                   //When passenger is nonMember and not older than 65
        m.bookSeat(13500, p1);                                  //When flight is fully booked
        m.bookSeat(10, p1);                                    //When flight does not exist
        
    }
}
