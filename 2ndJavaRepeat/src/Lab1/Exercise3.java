package Lab1;

import javax.swing.*;
import java.util.Scanner;

public class Exercise3 {




    public static void main (String[] args){


        Scanner myObj = new Scanner(System.in);

        String name = JOptionPane.showInputDialog(
                null, "Please enter your name?");
        System.out.println(name);

        String course = JOptionPane.showInputDialog(
                null, "Please enter your course?");
        System.out.println(course);

        String numOfSnacks = JOptionPane.showInputDialog(
                null, "How many snacks would you like?");
        System.out.println(numOfSnacks);

        double price = Double.parseDouble(JOptionPane.showInputDialog("price"));


        JOptionPane.showMessageDialog(null, "Name:" + name +"\nCourse:" + course + "\nSnacks" + numOfSnacks + "\nCost: " + price );



    }
}
