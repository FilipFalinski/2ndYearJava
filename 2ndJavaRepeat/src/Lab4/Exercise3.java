package Lab4;

import javax.swing.*;

public class Exercise3 {

    private String title;
    private float price;
    private String ISBN;
    private int numberOfPages;


    public  Exercise3(){

        this.title = "No Title";
        this.price = 0;
        this.ISBN =  "";
        this.numberOfPages = 0;

    }
    public  Exercise3(String title, float price, String isbn, int numberOfPages){

        setTitle(title);
        setPrice(price);
        setISBN(isbn);
        setNumberOfPages(numberOfPages);



    }


    public String getTitle(){


        return title;
    }

    public float getPrice(){


        return price;
    }

    public String getISBN(){


        return ISBN;
    }

    public int getnumberOfPages(){

        return numberOfPages;
    }

    public void setTitle(String title){

        if(title.equals("")) {
            JOptionPane.showMessageDialog(null, "....", "Error", JOptionPane.ERROR_MESSAGE);
            this.title = "No title";
        }
        else
            this.title = title;
    }

    public void setPrice(float price){

        this.price = price;
    }

    public void setISBN(String isbn){

        this.ISBN = isbn;
    }

    public void setNumberOfPages(int nOP){

        this.numberOfPages =nOP;
    }

    public String toString(){

        return   "Title: " + title + "\nPrice: " + price + "\nISBN: "  + ISBN + "\nNumber of pages: " + numberOfPages;
    }


}
