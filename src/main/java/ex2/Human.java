package ex2;

import java.time.LocalDate;


public class Human {

    int age = 0;
    String firstName = " ";
    String lastName = " ";
    LocalDate birthDate = LocalDate.of(1914, 7, 28);
    int weight = 0;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
       this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }
}
