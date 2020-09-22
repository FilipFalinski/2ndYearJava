package Lab1;

import javax.swing.*;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);

        String name = JOptionPane.showInputDialog(
                null, "Please enter your name?");
        System.out.println(name);

        String Distance = JOptionPane.showInputDialog(
                null, "Please enter the number of km cycled");
        System.out.println(Distance);

        JOptionPane.showMessageDialog(null, "Name:" + name +"\nDistance Cycled:" + Distance);


    }
}
