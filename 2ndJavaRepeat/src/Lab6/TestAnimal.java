package Lab6;

import java.util.AbstractList;

public class TestAnimal {

    public static void main(String[] args) {

        Animal allAnimals[] = new Animal[10];


        System.out.println("testing the no argument contructor");
        Animal animal1 = new Animal();


        String lionContinents[]={"Africa","Asia"};

        System.out.println("testing the no argument contructor");
        Animal animal2 = new Animal("Lion",lionContinents,200,40);

        System.out.println("testing the no argument contructor");
        Animal animal3 = new Animal("Rat",new String[]{"Europe","America","Africa","Asia"},0.2,5);

        System.out.println("testing the no argument contructor");
        Animal animal4 = new Animal("Polar bear",new String[]{"Antartica"},420,15);


        System.out.println("testing the no argument contructor");
        Animal animal5 = new Animal("Anaconda",new String[]{"Asia","America"},100,8);


        allAnimals[0]= animal1;
        allAnimals[1]= animal2;
        allAnimals[2]= animal3;
        allAnimals[3]= animal4;
        allAnimals[4]= animal5;

        System.out.println("\n\nThe detailss of all animals in the animal array are:\n\n");

        for(int i=0;i<allAnimals.length;i++)
            System.out.println(allAnimals[i]+"\n\n");



    }
}
