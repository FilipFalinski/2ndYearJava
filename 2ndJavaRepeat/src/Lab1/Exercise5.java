package Lab1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {


    public static double[] readFile() throws IOException {
        double[] gravity = new double[8];
        Scanner inFile = new Scanner(new File("gravitydata.txt"));
        int count = 0;
        while (inFile.hasNext()) {
            double temp = inFile.nextDouble();
            gravity[count] = temp;
            count++;
        }
        inFile.close();
        return gravity;
    }

    public static double[] calculateWeight(double[] gravity)  {
        double[] mass = new double[8];
        double[] weight = new double[8];

        for (int a = 0; a < 8; a++) {
            mass[a] = (110 * 433.59237) / (gravity[a]);
            weight[a] = (mass[a] * gravity[a]);

        }
        return weight;
    }

    public static void main(String[] args) throws IOException {

        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        double[] gravity = readFile();
        double[] weight = calculateWeight(gravity);
        for (int y = 0; y < 8; y++)
        {
            System.out.printf("%-11s", names[y]);
            System.out.printf("%13.2f", gravity[y]);
            System.out.printf("%20.2f\n", weight[y]);
        }
    }
}