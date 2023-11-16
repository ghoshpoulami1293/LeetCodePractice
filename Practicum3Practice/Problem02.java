package Practicum3Practice;


public class Problem02 extends Thread{
    static int counter = 1;
    static final Object lock = new Object();
    static final int MAX = 1000;
    int id;
    Problem02(int id){
        this.id = id;
    }
    @Override
    public void run() {
        while(counter<=MAX){
            synchronized (lock){
                try {
                    if (counter <= MAX) {
                        System.out.println(id + ":" + counter);
                        counter++;
                        lock.notifyAll();
                        if(counter<MAX)
                            lock.wait();
                    }else{
                        lock.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) throws InterruptedException {
        Problem02[] threads = new Problem02[10];
        System.out.println("STARTING!");
        for (int i = 0;i<10;i++){
            threads[i] = new Problem02(i);
        }
        for (int i = 0;i<10;i++){
            threads[i].start();
        }
        for (int i = 0;i<10;i++){
            threads[i].join();
        }
        System.out.println("FINISHED!");
    }
}
