package kata1;

import java.time.LocalDate;

/**
 * @author FernandoSanfielReyes
*/

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate= birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return LocalDate.now().minusYears(birthdate.getYear()).getYear();
    }
}
