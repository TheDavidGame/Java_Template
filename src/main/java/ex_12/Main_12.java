package ex_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main_12 {
    private final Second second;

    @Autowired
    public Main_12(Second second) {
        this.second = second;
    }

    public static void main(String[] args) throws Exception {
        String[] l;
        l = new String[2];
        l[1]="opa";
        l[0]="poa";
        SpringApplication.run(Main_12.class,l);
    }
}
