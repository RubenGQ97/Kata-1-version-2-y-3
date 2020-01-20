/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1.is2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Ruben Garcia Quintana
 */
public class Kata1IS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate date= LocalDate.of(1997,7,30);
        
        Person p1 = new Person ("Ruben", date);
       System.out.println(p1.getName() + " tiene " + p1.getAge());
    }
    
}
