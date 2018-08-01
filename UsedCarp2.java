
public class UsedCar extends Car{
    
    private double mileage;

    public UsedCar(String make, String model, int year, double price,double mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }
    
    @Override
    public String toString(){
        String out = String.format("%-12s%-12s%-12d$%.2f",getMake(),getModel(),getYear(),getPrice());
        return out;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    
    
}
