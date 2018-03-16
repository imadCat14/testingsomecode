package practice_threads;

public class Main {
    static volatile byte a = 1;
    public static void main(String[] args){
        Thread1 t = new Thread1();
        Thread t1 = new Thread(t);
        t1.start();


        for(int i = 0;i<10;i++) {
            while(true) {
                if (a == 1) {
                    System.out.println("I'm first thread!");
                    a = 2;
                    break;
                }
            }
        }
    }
}
