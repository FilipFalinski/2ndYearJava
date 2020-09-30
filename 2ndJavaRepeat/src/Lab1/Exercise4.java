package Lab1;

import javax.swing.*;



public class Exercise4 {
    
    

    public static void main(String[] args) {

        int distance ;
        final double Low_Rate = 1.75, High_Rate = 2.50;
        double excess ;
        String name;


        name = JOptionPane.showInputDialog("Please enter your name");
        distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled"));

        if(distance<=10)
            excess = Low_Rate*distance;
        else
            excess = Low_Rate*10 + High_Rate*(distance-10);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nDistance cycled: " + distance + "\nSponsorship: €" + String.format("%.2f",excess),"Receipt",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
