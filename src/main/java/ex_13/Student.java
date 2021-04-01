package ex_13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {
    @Value("${student.name}")
//@Value("Vlad")
    private String name;
    @Value("${student.last_name}")
//@Value("Bil")
    private String last_name;
    @Value("${student.group}")
//    @Value("ikbo-16-19")
    private String group;

    public Student() {
    }


    @PostConstruct
    public void init() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", group='" + group + '\'' +
                '}');
    }
}
