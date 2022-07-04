package sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> studentsName = new ArrayList<>();
        studentsName.add("Dorota");
        studentsName.add("Iris");
        studentsName.add("Anastazja");
        studentsName.add("Doman");
        studentsName.add("Zenobiusz");
        studentsName.add("Xawery");

        System.out.println("\n---------------");
        System.out.println(studentsName);
        for (String name : studentsName) {
            System.out.println(name);
        }

        //Strings sorting A -> Z by Collections.sort()
        System.out.println("\nSorting students name A -> Z.");
       /* Collections.sort(studentsName);
        System.out.println(studentsName);
        for (String sortName : studentsName) {
            System.out.println(sortName);
        }*/
        // String sorting A -> Z by Comparator
        studentsName.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(studentsName);
        for (String sortName : studentsName) {
            System.out.println(sortName);
        }
        System.out.println("\nSorting students name Z -> A.");
        studentsName.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(studentsName);
        for (String sortName : studentsName) {
            System.out.println(sortName);
        }
    }
}
