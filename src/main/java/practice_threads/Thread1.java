package practice_threads;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            while (true) {
                if (Main.a == 2) {
                    System.out.println("I'm second thread!");
                    Main.a = 1;
                    break;
                }
            }
        }
    }
}