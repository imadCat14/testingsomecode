package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException{

//        Byte b = new Byte((byte)8);
//
//
//
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String s1 = reader.readLine().trim();
//
//        byte a1 = Byte.parseByte(s1);
//
//        String s = reader.readLine().trim();
//
//        String s2 = reader.readLine().trim();
//
//        byte a2 = Byte.parseByte(s2);
//
//        switch (s){
//            case "+":
//                System.out.println(a1 + a2);
//                break;
//            case "-":
//                System.out.println(a1-a2);
//                break;
//            case "/":
//                System.out.println(a1/a2);
//                break;
//            case "*":
//                System.out.println(a1*a2);
//                break;
//            default:
//                System.out.println("Incorrect symbol!");
//                break;
////        }
//        boolean b;
//        b=false;
//        if (b) System.out.println ( " Э тoт код выполняется . " ) ;
//        b = false ;
//        if (b) System . out . println ( " Этoт код не выполня е т с я . " ) ;
//
//        System . out . println ( " 200 > 100 равно " + ( 200>100 ) ) ;
//        double h = 10;
//        double f = 3;
//        double c = Math.sqrt(h*h+f*f);
//        System.out.println(c);

        int[] ages = new int[10];
        for(int i = 0; i<10; i++){
            ages[i] = i;
        }
        for (int i :ages
             ) { System.out.println(ages[i]);

        }
        int i = 28;
        System.out.println(i);

    }


}
