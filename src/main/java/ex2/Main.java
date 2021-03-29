package ex2;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList <Human> list = new ArrayList <Human>();
        Human Alex = new Human(20,"Alex","Al", LocalDate.of(2001,10,23),20);
        Human Nikita = new Human(15,"Nikita","B", LocalDate.of(2016,9,5),15);
        Human Stepa = new Human(35,"Stepa","C", LocalDate.of(1986,12,14),32);
        list.add(Alex);
        list.add(Nikita);
        list.add(Stepa);
        Stream<Human> stream = list.stream();

        stream.sorted(Comparator.comparing((Human::getAge)).reversed())
                .peek((human -> System.out.println( human.getAge())))
                .sorted(Comparator.comparing((Human::getFirstName)))
                .peek((human -> System.out.println( human.getFirstName())))
                .sorted(Comparator.comparing((Human::getBirthDate)))
                .forEach((human ->{
                    System.out.println( human.getBirthDate() + " и возраст " + human.getAge());

                }));
        stream = list.stream();
        ArrayList weight = new ArrayList<Integer>();
        stream.forEach(human -> weight.add(human.getWeight()));
        int k= 0;
        for (int i=0 ;i< weight.size();i++){
            int k1= (int) weight.get(i);
            k=k+k1;
        }
        stream = list.stream();
        System.out.println(k/stream.count());
    }
}
