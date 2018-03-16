package thread_practice;

public class Main {
    static int a = 0;

    public static void main(String[] args)throws InterruptedException  {
    Thread1 t1 = new Thread1();
    Thread t2 = new Thread(t1);
    t2.start();

        for(int i = 0; i<500000; i++){
    increment();
        }
    t2.join();
    System.out.println(a);
    }
    static synchronized void increment(){
        a++;
    }
    static synchronized void increment1(){
        a++;
    }
}
