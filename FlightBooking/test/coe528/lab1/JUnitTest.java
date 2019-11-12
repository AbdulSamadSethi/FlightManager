/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdul
 */

import static org.junit.Assert.*;

public class JUnitTest {
    
    @Test
    public void testConstructor() {
        Flight VP = new Flight(1000, "Vancouver", "Pakistan", "7:30", 300, 200.00);
        assertEquals(1000,VP.getflightNumber());
        assertEquals("Vancouver",VP.getorigin());
        assertEquals("Pakistan",VP.getdestination());
        assertEquals("7:30",VP.getdepartureTime());
        assertEquals(300,VP.getcapacity());
        assertEquals(200.00,VP.getoriginalPrice(),0.01);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testInvalidConstrustor() {
        Flight BB = new Flight(1000, "Buffalo", "Buffalo", "7:30", 300, 1.00);    
    }
    
    @Test
    public void testgetsetbook() {
        Flight FN = new Flight(1000, "Finland", "Norway", "9:00", 100, 50.00);
        
        FN.getcapacity();
        FN.getdepartureTime();
        FN.getdestination();
        FN.getorigin();
        FN.getoriginalPrice();
        FN.getnumberOfSeatsLeft();
        FN.getflightNumber();
        
        FN.setcapacity(50);
        FN.setdepartureTime("7:30");
        FN.setdestination("Saudi Arabia");
        FN.setflightNumber(3010);
        FN.setnumberOfSeatsLeft(30);
        FN.setorigin("Toronto");
        FN.setoriginalPrice(80.00);
        
        FN.bookASeat();
        
        FN.toString();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
