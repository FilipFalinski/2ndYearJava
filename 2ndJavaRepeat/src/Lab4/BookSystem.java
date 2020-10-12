package Lab4;

import javax.swing.*;

public class BookSystem {

    public static void main(String []args){

        Exercise3 ff, ff2, ff3;

        ff = new Exercise3();
        ff3 = new Exercise3("", 120,"agheo46042654",675);

        JOptionPane.showMessageDialog(null, ff.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ff3.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);

        String title = JOptionPane.showInputDialog(null, "Please Enter the Title: \n" , "Book Title",JOptionPane.INFORMATION_MESSAGE);

        while(title.equals(""))
        {

        }

        float price = Float.parseFloat(JOptionPane.showInputDialog(null, "Please Enter Price: \n" , "Book Price",JOptionPane.INFORMATION_MESSAGE));

        String isbn = JOptionPane.showInputDialog(null, "Please Enter ISBN: \n" , "Book ISBN",JOptionPane.INFORMATION_MESSAGE);

        int numOfPages = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number Of Pages: \n" , "Pages Of Book",JOptionPane.INFORMATION_MESSAGE));

        ff2 = new Exercise3(title,price,isbn,numOfPages);

        JOptionPane.showMessageDialog(null, ff.toString() + "\n\n" + ff2.toString() +"\n\n" + ff3.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);


    }
}
