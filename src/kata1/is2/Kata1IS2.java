/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1.is2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author senyo
 */
public class Kata1IS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1997, 7, 30);  
        Person p1 = new Person ("Ruben", date);
        System.out.println(p1.getName() + " tiene " + p1.getAge() + " años");
    }
    
}
