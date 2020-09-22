package Lab1;

import javax.swing.*;


public class Exerrcise1 {

    public static void main (String[] args){
        Exerrcise1 hello  =  new Exerrcise1();

        JFrame frame = new JFrame(" Exciting Times ahead");
        JLabel lbText = new JLabel("Hello OOP World");

        frame.getContentPane().add(lbText);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
