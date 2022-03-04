package map;

import java.time.LocalDate;
import java.util.*;

/**
 * Program demonstruje użycie słownika z kluczami typu String i wartościami typu Employee
 * @author Tomek
 *
 */
public class MapTest {

    public static void main(String[] args) {

        var staff = new HashMap<String, Employee>();

        staff.put("144-25-5464", new Employee("Anna Kowalska"));
        staff.put("567-24-2546", new Employee("Henryk Kwiatek"));
        staff.put("157-62-7935", new Employee("Marcin Nowak"));
        staff.put("456-62-5527", new Employee("Franciszek Frankowski"));

        //wydruk wszystkich pozycji
        System.out.println(staff);

        //usunięcie wartości
        staff.remove("567-24-2546");

        //podmienienie pozycji
        staff.put("456-62-5527", new Employee("Weronika Kowalska"));

        //wyszukanie wartości
        System.out.println(staff.get("157-62-7935"));

        //iteracja przez wszystkie pozycje
        staff.forEach((k, v) ->
                System.out.println("Klucz=" + k + ", wartość=" + v));
    }

}

/**
 * klasa Employee na potrzeby przykladu
 */
class Employee{

    //pola
    private String name;

    //Konstruktor
    public Employee(String n) {
        name = n;

    }

    //Metody
    public String getName() {
        return name;
    }

}