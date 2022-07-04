package sorting;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class PersonListMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Dorota", "Racka", 3));
        persons.add(new Person("Tomasz", "Nowak", 53));
        persons.add(new Person("Iris", "Marchewka", 37));
        persons.add(new Person("Anastazja", "Perła", 18));
        persons.add(new Person("Doman", "Ziemiański", 73));
        persons.add(new Person("Zenobiusz", "Pawicki", 27));
        persons.add(new Person("Xawery", "Niwiński", 18));
        persons.add(new Person("Ireneusz", "Marchewka", 38));
        persons.add(new Person("Tomasz", "Nowak", 18));
        persons.add(new Person("Dorota", "Dorocińska", 21));

        // sorting by name next surname and age
     /*   System.out.println("Sorting by name, surname and age (chronology)");
        sort(persons, new PersonNameComparator());
        System.out.println(persons);

        // sorting by name next surname and age
        System.out.println("Sorting by surname, name and age (chronology)");
        sort(persons, new PersonSurnameComparator());
        System.out.println(persons);
        System.out.println("Sorting by age, name and surname (chronology)");
        sort(persons, new PersonAgeComparator());
        System.out.println(persons);
        System.out.println("Sorting by name, surname and age (reverse chronology)");
        sort(persons, new PersonNameComparator().reversed());
        System.out.println(persons);
        // sorting by name next surname and age
        System.out.println("Sorting by surname, name and age (reverse chronology)");
        sort(persons, new PersonSurnameComparator().reversed());
        System.out.println(persons);
        System.out.println("Sorting by age, name and surname (reverse chronology)");
        sort(persons, new PersonAgeComparator().reversed());
        System.out.println(persons);

        // without object PersonComparator
        sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getName().compareTo(o2.getName());

                if (result == 0) {
                    result = o1.getSurname().compareTo(o2.getSurname());
                    if (result == 0) {
                      return Integer.compare(o1.getAge(),o2.getAge());
                    }
                    return result;
                }
                return result;
            }
        });*/
        // sorting by lambda
       // System.out.println(persons);
        sort(persons, (Person o1, Person o2) -> {
            int result = o1.getName().compareTo(o2.getName());

            if (result == 0) {
                result = o1.getSurname().compareTo(o2.getSurname());
                if (result == 0) {
                    return Integer.compare(o1.getAge(),o2.getAge());
                }
                return result;
    }
            return result;
});
        System.out.println(persons);
        Comparator<Person> sortingByAge = Comparator.comparingInt(Person::getAge);
        sort(persons,sortingByAge);
        System.out.println(persons);
        Comparator<Person> sortingByName= Comparator.comparing(Person::getName);
        sort(persons,sortingByName);
        System.out.println(persons);
        Comparator<Person> sortingBySurname= Comparator.comparing(Person::getSurname);
        sort(persons,sortingBySurname.reversed());
        System.out.println(persons);
    }
}


