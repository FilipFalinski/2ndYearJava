package Lab3;

public class Computer {

    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    public Computer(){
        manufacturer = "Not available";
        type = "Not available";
        speed = 0;
        RAM = 0;
        price = 0;
    }

    public Computer(String manufacturer, String type, double speed, int RAM, double price){
        this.manufacturer =manufacturer;
        this.type = type;
        this.speed = speed;
        this.RAM = RAM;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed>0)
        this.speed = speed;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){

        return  "Manufacturer:" + getManufacturer() + "Type" + getType() + "Speed:" +getSpeed() +
                "RAM" +getRAM() + "Price:" + getPrice();
    }
}
