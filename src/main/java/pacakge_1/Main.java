package pacakge_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static class Person{
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        Main a1 = new Main();




    }
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Считываем сколько людей введёт пользователь
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");//Считываем строку и разбиваем её на имя и возраст
            persons.add(new Person(input[0],Integer.parseInt(input[1])));// Создаем человека
        }

        Collections.sort(persons, (o1, o2) -> Integer.compare(o1.getAge(),o2.getAge())); //Сортируем по возрасту

        //Достаём самого старого и выводим
        System.out.println(persons.get(persons.size() - 1).getName() + " is the eldest");
    }
}
