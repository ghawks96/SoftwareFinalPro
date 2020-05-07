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

    public Vehicle() {

    }

    // Getters & Setters *****************************************
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if( (manufacturer == "Audi") || (manufacturer == "BMW") || (manufacturer == "Toyota") ) {
            this.manufacturer = manufacturer;
        }
        else {
            throw new IllegalArgumentException("Not a valid manufacturer");
        }
    }

    public String getYearOfReg() {
        return yearOfReg;
    }

    public void setYearOfReg(String yearOfReg) {
        if(yearOfReg == "2021") {
            throw new IllegalArgumentException("Not a valid year");
        }
        else
            this.yearOfReg = yearOfReg;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        if(engineSize < 500) {
            throw new IllegalArgumentException("Not a valid engine size");
        }
        else
            this.engineSize = engineSize;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        if(colour.length() < 3) {
            throw new IllegalArgumentException("Not a valid colour");
        }
        else
            Colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if(mileage < 0) {
            throw new IllegalArgumentException("Not a valid mileage");
        }
        else
            this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException("Not a valid price");
        }
        else
            this.price = price;
    }
}
