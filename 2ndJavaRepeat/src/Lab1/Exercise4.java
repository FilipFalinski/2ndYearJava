package Lab1;

import javax.swing.*;
import java.util.Scanner;


public class Exercise4 {
    
    

    public static void main(String[] args) {

        int distance = 10;
        double rate = 1.75 ;
        double excess = 2.50;
        
        
            if(distance <= 10) {

                rate = 1.75 * distance;
            }
            else{
                if(distance > 10){
                    excess= rate+distance*2.50;
                }
            }

        Scanner myObj = new Scanner(System.in);

        String name = JOptionPane.showInputDialog(
                null, "Please enter your name?");
        System.out.println(name);

        String Distance = JOptionPane.showInputDialog(
                null, "Please enter the number of km cycled");
        System.out.println(Distance);


            
        JOptionPane.showMessageDialog(null, "Name:" + name +"\nDistance Cycled:" + Distance +"\nSponsorship amount:" + rate + excess );


    }
}
