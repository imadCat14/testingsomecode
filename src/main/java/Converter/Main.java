package Converter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Insert number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int choose = Integer.parseInt(s);
        System.out.println("Choose 1 if measure or 2 if distance: ");
        String s2 = reader.readLine();
        int choose2 = Integer.parseInt(s2);
        switch (choose2) {

            case 1:
                System.out.println("Choose measure 1 for kilo, 2 for gram: ");
                String s4 = reader.readLine();
                int choose5 = Integer.parseInt(s4);
                switch (choose5){
                    case 1:
                        System.out.println(choose + "kilo");
                        break;
                    case 2:
                        System.out.println(choose*1000 +"gram");
                        break;
                    default:
                        System.out.println("Congratz, you've broken the programm! go restart prog now!");
                }
                break;
            case 2:
                System.out.println("Choose measure 1 for km, 2 for metre(s): ");
                String s3 = reader.readLine();
                int choose4 = Integer.parseInt(s3);
                switch (choose4){
                    case 1:
                        System.out.println(choose + "km");
                        break;
                    case 2:
                        System.out.println(choose*1000 +"metre(s)");
                        break;
                    default:
                        System.out.println("Congratz, you've broken the programm! go restart prog now!");}
                break;
            default:
                System.out.println("Insert 1 or 2, you faggot!Restart prog!");
        }

            }
    }






