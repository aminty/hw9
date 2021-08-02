package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Amin", "Tavakkkoli"));
        persons.add(new Person("Ali", "Akbari"));
        persons.add(new Person("Ahmad", "Rezaee"));
        persons.add(new Person("Milad", "Abdi"));

         //Collections.sort(persons, Comparator.comparing(Person::getName));
         Collections.sort(persons);

        //persons.sort(new SortByName());

        for (Person person : persons) {
            System.out.println(person.getName()+"  "+person.getLastName());
        }
    }
}
