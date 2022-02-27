package PackageTest;
import com.lach.corejava.*;
//W powyższym pakiecie znajduje się definicja klasy Employee.
//There is an Employee class definition in the above package.

import static java.lang.System.*;

/**
 * @author Tomek
 *
 */
public class PackageTest {

    public static void main(String[] args) {

        //Dzięki instrukcji import nie ma konieczności stosowania pełnej nazwy.
        //Thanks to the import instruction, it is not necessary to use the full name.
        //com.lach.corejava.Employee
        var harry = new Employee("Hubert Kowalski", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        //Dzięki instrukcji static nie ma konieczności pisać System.out.
        //Thanks to the static statement, there is no need to write System.out.
        out.println("name: " + harry.getName() + ", salary: "
                + harry.getSalary());

    }

}
