package sorting;


import java.util.Arrays;
import java.util.Comparator;


public class PersonArraysMain {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Dorota", "Racka", 3),
                new Person("Tomasz", "Nowak", 53),
                new Person("Iris", "Marchewka", 37),
                new Person("Anastazja", "Perła", 18),
                new Person("Doman", "Ziemiański", 73),
                new Person("Zenobiusz", "Pawicki", 27),
                new Person("Xawery", "Niwiński", 18),
                new Person("Ireneusz", "Marchewka", 38),
                new Person("Tomasz", "Nowak", 18),
                new Person("Dorota", "Dorocińska", 21)};

        System.out.println("\nSorting by name");
        Arrays.sort(people,Comparator.comparing(Person::getName));
        System.out.println(Arrays.toString(people));

        System.out.println("\nSorting by surname");
        Arrays.sort(people,Comparator.comparing(Person::getSurname));
        System.out.println(Arrays.toString(people));

        System.out.println("\nSorting by age");
        Arrays.sort(people,Comparator.comparingInt(Person::getAge));
        System.out.println(Arrays.toString(people));

    }
}


