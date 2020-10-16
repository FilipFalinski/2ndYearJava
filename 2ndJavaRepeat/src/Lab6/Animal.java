package Lab6;

import java.util.Arrays;

public class Animal {

    private String type;
    private String continents[];
    private double weight;
    private int age;

    public Animal(){
        this("no type specified",null,0.0,0);
    }

    public Animal(String type, String[] continents, double weight, int age) {
        this.type = type;
        this.continents = continents;
        this.weight = weight;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getContinents() {
        return Arrays.copyOf(continents,continents.length);
    }

    public void setContinents(String continents[]) {
        if(continents!=null)
        this.continents = Arrays.copyOf(continents,continents.length);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        String str = " Animal type" +getType() + "\nAnimal weight" + getWeight() +
                "\nAnimal age" + getAge() + "\nAnimal continent";

        if(continents==null){
            str+="no continents specified";
            return str;

        }

        for(int i=0;i<getContinents().length;i++)
            str+=continents[i] + "";
        return str;
    }
}
