package package_2;

public class MyDogList extends Dog {
    private MyDogList[] dogs = new MyDogList[5];
    private int nextIndex = 0;


    public void addDog(MyDogList d) {
        for (nextIndex = 0; nextIndex < dogs.length; nextIndex++) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
        }


    }


}