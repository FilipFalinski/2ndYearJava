package problemSolving;

import javax.swing.*;

public class week2Exercise1 {

    public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length" +
                " of the first side of the triangle"));

        b = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length" +
                " of the second side of the triangle"));

        c = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length" +
                " of the third side of the triangle"));

        triangleDetails(a,b,c);

        System.exit(0);

    }


    public static void triangleDetails(double side1, double side2, double side3) {
        double area, s;
        String category = "";

        s = (side1+side2+side3)/2;

        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        if(side1 == side2 && side1 == side3) //&& side2 == side3)
            category = "equilateral";
        else if(side1 == side2 && side1 != side3 ||
                side1 == side3 && side1 != side2 ||
                side2 == side3 && side2 != side1)
            category = "isosceles";
        else
            category = "scalene";


        JOptionPane.showMessageDialog(null,"The area" +
                        " of the triangle is " + String.format("%.3f",area) +
                        " and it is a " + category + " triangle",
                "Triangle Details",JOptionPane.INFORMATION_MESSAGE);
    }
}
