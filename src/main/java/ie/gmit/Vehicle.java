package ie.gmit;

public class Vehicle {

    private String manufacturer;
    private String yearOfReg;
    private int engineSize;
    private String Colour;
    private int mileage;

    private double price;

    //Constructors *******************************************
    public Vehicle(String manufacturer, String yearOfReg, int engineSize, String colour, int mileage, double price) {
        setManufacturer(manufacturer);
        setYearOfReg(yearOfReg);
        setEngineSize(engineSize);
        setColour(colour);
        setMileage(mileage);
        setPrice(price);
    }

    // Getters & Setters *****************************************
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearOfReg() {
        return yearOfReg;
    }

    public void setYearOfReg(String yearOfReg) {
        this.yearOfReg = yearOfReg;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
