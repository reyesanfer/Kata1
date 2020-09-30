package kata1;

import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author FernandoSanfielReyes
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person persona = new Person("Fernando Sanfiel Reyes", LocalDate.of(2000,Month.SEPTEMBER,05));
        System.out.println(persona.getName()+" tiene "+persona.getAge()+" años.");
    }
}
