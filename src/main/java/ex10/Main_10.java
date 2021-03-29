package ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_10 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Musician musician = context.getBean(guitarist.class);
        musician.doCoding();

        musician = context.getBean(Drummer.class);
        musician.doCoding();

        musician = context.getBean(trombonist.class);
        musician.doCoding();
    }}