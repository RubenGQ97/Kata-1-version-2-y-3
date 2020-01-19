/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1.is2;

import java.util.Date;

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
        
        Person p1= new Person("Ruben", new Date(97, 7, 30));
        System.out.println(p1.getName() + " tiene "+ p1.getAge());
        Person p2= new Person("Juan", new Date(38, 1, 14));
        System.out.println(p2.getName() + " tiene "+ p2.getAge());
    }
    
}
