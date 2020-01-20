package kata1.is2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final Calendar nacimiento;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    
    
    public Person(String name, Calendar nacimiento) {
        this.name = name;
        this.nacimiento = nacimiento;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getNaciomiento() {
        return nacimiento;
    }

   public int getAge(){
       Calendar actual = GregorianCalendar.getInstance();
       return (int) ( milliSecondsToYear(actual.getTimeInMillis()-nacimiento.getTimeInMillis()) );              
               
   } 
   private long milliSecondsToYear(long milles){
        return milles /MILLISECONDS_PER_YEAR;
    }
    
}
