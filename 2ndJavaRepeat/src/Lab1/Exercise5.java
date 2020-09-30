package Lab1;

import java.util.Scanner;

public class Exercise5 {
    public static void main (String args[]){
        final float g = 9.8f;
        float Mp,Me,Re,Rp,Gp;

        Scanner input = new Scanner(System.in);

        System.out.print("enter the mass of the other planet: ");
        Mp = input.nextFloat();

        System.out.print("enter the mass of earth: ");
        Me = input.nextFloat();

        System.out.print("enter the radius of  earth: ");
        Re = input.nextFloat();

        System.out.print("enter the radius of the other planet: ");
        Rp = input.nextFloat();

        Gp = g*Mp*Re*Re/(Me*Rp*Rp);

        System.out.println("The acceleration due to gravity on the other planet is " + String.format("%.2f",Gp) + " m/s/s");
    }
}



