package package_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
    Main o = new Main();
    o.go();

    MyDogList d1 = new MyDogList();
    d1.addDog(d1);


    }
void go(){
        int y= 7;

        for(int x = 1; x<8; x++){

            if(x>4){
                System.out.print(++y + " ");
            }
            if(y>14){
                System.out.println(" x = " +x);
                break;
            }
            y++;
        }
}



}


