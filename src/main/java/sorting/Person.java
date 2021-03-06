package sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return "Hi! I'm " + name + " " + surname +
                ". I'm " + age +
                " years old.\n";
    }


}
