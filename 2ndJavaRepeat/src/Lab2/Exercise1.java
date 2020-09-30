package Lab2;

import javax.swing.*;

public class Exercise1 {

    public static void main(String[] args) {
        float price, cheap=0, dear=0;
        int hardDiskSpace=0, numProcess=0,totalDiskSpace=0, i=0;
        String serialNum, processorType, processorTypeCheap = "", hardDiskSpaceAsString,priceAsString;
        boolean valid;

        serialNum= JOptionPane.showInputDialog("enter the serial number" + "(<CR to exit)");

        while (!serialNum.equals("")){
            hardDiskSpaceAsString = JOptionPane.showInputDialog("enter the " + "hard-disk space");

            valid = false;

            while (!valid){
                for(i=0; i < hardDiskSpaceAsString.length();i++)
                    if(!Character.isDigit(hardDiskSpaceAsString.charAt(i)))
                        break;

                if(i < hardDiskSpaceAsString.length())
                    hardDiskSpaceAsString = JOptionPane.showInputDialog("invalid! please re-enter");


                else
                    {
                    hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);

                    if (hardDiskSpace > 50 && hardDiskSpace < 5000)
                        valid = true;
                    else
                        hardDiskSpaceAsString = JOptionPane.showInputDialog("invalid! please re-enter");
                }
            }
            processorType = JOptionPane.showInputDialog("enter the " + "processor type");

            priceAsString = JOptionPane.showInputDialog("enter the price");

            price = Float.parseFloat(priceAsString);

            numProcess++;

            if(numProcess == 1){
                cheap = price;
                dear = price;
                processorTypeCheap = processorType;
            }
            else if (price<cheap){
                cheap = price;
                processorTypeCheap = processorType;
            }
            else if (price>dear)
                dear = price;

            totalDiskSpace += hardDiskSpace;

            serialNum = JOptionPane.showInputDialog("enter the serial" +"number (<CR> to exit");
        }

        if(numProcess > 0)
            JOptionPane.showMessageDialog(null,"\n\nThe average disk space available on "
                            + "the computers processed is: " + String.format("%.0f",
                    averageDiskSpace(totalDiskSpace,numProcess))
                            + " GB\nThe price range of the computers is from €" + String.format("%.2f",
                    cheap) + " to €" + String.format("%.2f",dear) + "\nThe processor type "
                            + "on the cheapest computer is " + processorTypeCheap
                    ,"Computer Stats",JOptionPane.INFORMATION_MESSAGE);


				else
        JOptionPane.showMessageDialog(null,"No data entered!","Computer Data",
                JOptionPane.INFORMATION_MESSAGE);
        ;
        System.exit(0);
    }

    public static float averageDiskSpace(int totalDiskSpace,int numProcessed)
    {
        return (float)totalDiskSpace/numProcessed;
    }
    }

