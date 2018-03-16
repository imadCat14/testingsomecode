package package_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer(500, 300, "Toshiba", "TESORO");


        comp.setHdd(1100);
        comp.setRam(16000);

        System.out.println(comp.getHdd());
        System.out.println(comp.getRam());
        System.out.println(comp.monitor);
        System.out.println(comp.keyboard);

        int a = 50;
        switch (a) {
            case 49:
                System.out.println("a men'she 50");
                break;
            case 51:
                System.out.println("a bol'she 50");
                break;
            case 50:
                System.out.println("a ravna 50");
                break;
            default:
                System.out.println("nothing of above");
        }

        byte[] mass = new byte[20];
        byte e = 0;
        while (e < 20) {
            mass[e] = e;
            e++;
        }
        for (int n = 0; n < 20; n++) {


            System.out.println(mass[n]);
        }
        Computer[] mass1 = new Computer[10];

        for(int i=0; i<mass1.length; i++){
            mass1[i]  = new Computer();
        }
        mass1[0].keyboard = "TESORO";
    }
}
