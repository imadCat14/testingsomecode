package com.example.firstlesson;

public class Aragorn extends Humans {
   final String BRAVERY = "I AM A HERO!";
    Aragorn a2 = new Aragorn();
   static String s1 = "String";
   public void  method1() {
       Aragorn a1 = new Aragorn();
       String HONEST = " (c) A.Crowley";
      System.out.println(Humans.HONEST + HONEST);
       a1.run();
       String s2 = this.a2.run();
       String s3 = s2 + a1.run();
       System.out.println(s3);

   }
}
