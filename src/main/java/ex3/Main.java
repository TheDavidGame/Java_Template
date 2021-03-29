package ex3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

//        Thread thread1 =  new MyThread("first");
//        Thread thread2 =  new MyThread("second");
//        Thread thread3 =  new MyThread("third");
//        thread1.start();
//        thread2.start();
//        thread3.start();

        Thread synchr1 = new MyThread("first");
        Thread synchr2 = new MyThread("seond");
        synchr1.start();
        synchr2.start();

    }
}

class MyThread extends Thread {
    MyThread(String name){ this.setName(name);}
    HashSet<String> countryHashSet = new HashSet<>(1);
    Semaphore sem = new Semaphore(1);

    public void run(){
        countryHashSet.add("First");
        try {
            sem.acquire();
            System.out.println(Thread.currentThread().getName() + " ожидает разрешение");
            for (int i = 1; i < 4; i++) {
                countryHashSet.add("second");
                Iterator<String> itr = countryHashSet.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next().toString());
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " освобождает разрешение");
        sem.release();
    }
}


