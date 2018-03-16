package thread_practice;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<500000;i++){
            Main.increment1();
        }

    }

}
