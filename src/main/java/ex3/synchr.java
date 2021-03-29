package ex3;

import java.util.ArrayList;

public class synchr extends Thread{
    ArrayList list = new ArrayList<Integer>(1);
    public synchr(String name) {
        super(name);
        list.add(1);
        list.add(2);

    }
    @Override
    public void run() {
        listyncron();
    }
        public void listyncron()
        {
            synchronized (list)
            {
                for (int i = 1; i < 4; i++) {
                    System.out.println(Thread.currentThread().getName() + list.get(i));
                }
            }
        }
    }

