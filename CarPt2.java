
public class Car {
    
    private String make;
    private String model;
    private int year;
    private double price;

    public Car() {
        // set the default values for the car
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0;
    }
  
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        String format = String.format("%-12s%-12s%-12d$%-12.2f",make,model,year,price);
        return format;
    }
    
}
