package kata1.is2;

import java.util.Date;

public class Person {
    private final String name;
    private final Date nacimiento;
    private static final int MS_PER_SECOND =1000;
    private static final int SECONDS_PER_MINUTE =60;
    private static final int MINUTES_PER_HOUR =60;
    private static final int HOURS_PER_DAY =24;
    private static final double DAYS_PER_YEAR =365.25;
    private static final int MS_PER_YEAR =MS_PER_SECOND;
    
    
    
    public Person(String name, Date nacimiento) {
        this.name = name;
        this.nacimiento = nacimiento;
    }
    
    public String getName() {
        return name;
    }

    public Date getNaciomiento() {
        return nacimiento;
    }

   public int getAge(){
       return (int) (( new Date().getTime() - nacimiento.getTime() )/31536000000L);
               
               
   } 
    
}
