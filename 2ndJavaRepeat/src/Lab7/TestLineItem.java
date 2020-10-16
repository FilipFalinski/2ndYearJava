package Lab7;

public class TestLineItem {

    public static void main(String[] args) {

        LineItem allLineItems[] = new LineItem[10];

        Product p1 = new Product(1,"pen","this is a pen");
        Product p2 = new Product(2,"pencil","this is a pencil");
        Product p3 = new Product(3,"ruler","this is a ruler");
        Product p4 = new Product(4,"marker","this is a marker");

        LineItem item1 = new LineItem(1,3,p1);
        LineItem item2 = new LineItem(2,4,p2);
        LineItem item3 = new LineItem(3,2,p3);

        allLineItems[0] =item1;
        allLineItems[1] =item2;
        allLineItems[2] =item3;

        System.out.println("displaying the state off all line items \n\n");
        for(int i=0;i<allLineItems.length;i++)
            if(allLineItems[i]!=null)
                System.out.println(allLineItems[i]);

            System.out.println("now changing product associated with first line item to a marker \n\n");
            item1.setProduct(p4);


            System.out.println("Displaying the state of all line items again \n\n");
        for(int i=0;i<allLineItems.length;i++)
            if(allLineItems[i]!=null)
                System.out.println(allLineItems[i]);

            System.out.println("now destroying the second line item ( the 4 pencils) \n");

            item2 = null;
            allLineItems[1] = null;

            System.out.println("diplaying the state of the second product \n");
            System.out.println(p2);


        System.out.println("Displaying the state of all line items last time \n\n");
        for(int i=0;i<allLineItems.length;i++)
            if(allLineItems[i]!=null)
                System.out.println(allLineItems[i]);


    }
}
