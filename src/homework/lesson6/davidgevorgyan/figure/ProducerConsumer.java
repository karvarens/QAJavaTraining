package homework.lesson6.davidgevorgyan.figure;



import java.util.ArrayList;


public class ProducerConsumer{
    private  ArrayList queue = new ArrayList (100);
    private final static int MAXIMAL_SIZE = 10;
    private int a = 0;


    private  void producer() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while(queue.size() == MAXIMAL_SIZE) {
                    wait();
                }
                queue.add(a);
                a++;
                System.out.println("Element is added. Queue Size is: " + queue.size());
                }
            }
        }

    private  void consumer() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (queue.size() < 1) {
                    wait();
                }
                System.out.println("Removed element: " + queue.remove(0) + "; Queue Size is:" + queue.size());
                notify();
                }
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {

        ProducerConsumer a = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }
}
