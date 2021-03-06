package Lab2;

import javax.swing.*;

public class Exercise4 {

    public static void main(String[] args) {
        double numbers[] = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};

        String output;

        output = "The largest value in the array is " + largest(numbers) +
                "\nThe average value in the array is " + String.format("%.3f",average(numbers)) +
                "\nThe list of values above the average is: " + aboveAverage(numbers,average(numbers));

        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    public static double largest(double[] numbers){
        double total = 0;

        for(int i=0; i<numbers.length; i++)
            total+= numbers[i];

        return total/numbers.length;
    }

    public static double average(double[] numbers)
    {
        double total = 0;

        for(int i=0; i<numbers.length; i++)
            total += numbers[i];

        return total/numbers.length;
    }

    public static String aboveAverage(double[] numbers, double average){
        String listAboveAverage="";

        for(int i=0; i<numbers.length; i++)
            if(numbers[i]>average)
                listAboveAverage += numbers[i] + "";

            return  listAboveAverage;
    }
}
