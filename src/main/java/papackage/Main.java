package papackage;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        NewThread thread = new NewThread();
        thread.start();

        for(int i=0;i<10;i++){
            System.out.println("I'm first thread!");
            Thread.sleep(100);
        }
    }
}
