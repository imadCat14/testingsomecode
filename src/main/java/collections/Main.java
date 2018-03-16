package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        for(int i = 0; i<1000000;i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        long a = System.currentTimeMillis();

        arrayList.remove(10195);


        long b = System.currentTimeMillis() - a;


        System.out.println(b +"   ArrayList Time");

        long d = System.currentTimeMillis();

        linkedList.remove(10195);

        long c = System.currentTimeMillis() - d;

        System.out.println(c + " LinkedList Time");
    }
}
