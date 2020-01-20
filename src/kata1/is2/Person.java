package kata1.is2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    
    private final String name;
    private final LocalDate nacimiento;
    
    public Person(String name, LocalDate nacimiento) {
        this.name = name;
        this.nacimiento = nacimiento;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getNaciomiento() {
        return nacimiento;
    }

   public int getAge(){
       LocalDate actual = LocalDate.now();
       return Period.between(nacimiento, actual).getYears();
              
   } 
    
}
