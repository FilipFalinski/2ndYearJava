package Lab1;

import javax.swing.*;
import java.util.Scanner;

public class Exercise3 {




    public static void main (String[] args){

        String name, course;
        int numOfSnacks;


         name = JOptionPane.showInputDialog("Please enter your name?");


         course = JOptionPane.showInputDialog("Please enter your course?");


        numOfSnacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like?"));


        JOptionPane.showMessageDialog(null, "Name:" + name +"\nCourse:" + course + "\nSnacks" + numOfSnacks + "\nCost: "  + (numOfSnacks*2),
        "Receipt",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);



    }
}
