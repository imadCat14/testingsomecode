package papackage;

public class NewThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I'm second thread!");
        }

    }
}
