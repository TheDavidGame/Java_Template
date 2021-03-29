package ex4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
    Execut execut = new Execut(6);
    execut.run();
    }
}


class Execut {
    private int number_of_Threads;
    private ExecutorService service;
    public Execut(int n){
        number_of_Threads = n;
        service = Executors.newFixedThreadPool(number_of_Threads);
    }
    public void run() {
        for (int i = 0; i < number_of_Threads; i++) {
            int num = i;
            service.submit(new Runnable() {
                public void run() {
                    Thread.currentThread().setName(Integer.toString(num));
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        service.shutdown();
    }
}