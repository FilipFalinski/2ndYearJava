package problemSolving;

import javax.swing.*;

public class Week1Exercise1 {

    public static void main(String[] args) {
        int a, b, c, determinant;
        String banner = "****Calcualting the values and types of the roots of a quadratic" +
                " equation****\n\n\nThe quatratic equation has the form ax^2 + bx + c = 0" +
                "\n\n\n";
        String rootTypesAndValues="";
        double x, y;

        a = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer" +
                " coefficient a"));

        b = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer" +
                " coefficient b"));

        c = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer" +
                " coefficient c"));

        determinant = b*b - 4*a*c;

        if(determinant>0) {
            //calculate root1 and root2 and then "build" up the rootTypesAndValues variable
        }
        else if(determinant == 0) {
            //calculate root1 and root2 and then "build" up the rootTypesAndValues variable
        }
        else {
            //calculate values for x and y
        }


        JOptionPane.showMessageDialog(null,"The quadratic equation has xxxxxx. The" +
                        " value of the determinant is " + determinant,
                "Roots & Types",JOptionPane.INFORMATION_MESSAGE);



        System.exit(0);
    }
}
