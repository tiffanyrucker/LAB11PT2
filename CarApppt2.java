



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/
public class CarApp {
    
    // input scanner 
    private Scanner in;
    
    public CarApp() {
        // create the scanner to scan the inputs
        in = new Scanner(System.in);
    }
    
    // set the format of the value
    private String formatValue(double d){
            DecimalFormat df=new DecimalFormat("#,##0.0");
        return df.format(d);  
    }
    
    
    public static void main(String[] args) {
        // create the CarApp
        CarApp app = new CarApp(); 
        
        // to store all the cars and used cars
        ArrayList<Car> carList = new ArrayList<>();
        // read all the car details and store them into arrayList

        // create cars and add it to the list
        Car car1 = new Car("Nikolai", "Model S", 2017, 54999.90);
        Car car2 = new Car("Fourd", "Escapade", 2017, 31999.90);
        Car car3 = new Car("Chewie", "Vette", 2017, 44989.95);
        UsedCar car4 = new UsedCar("Hyonda", "Prior", 2015, 14795.50,35987.6);
        UsedCar car5 = new UsedCar("GC", "Chirpus", 2013, 8500.00,12345.0);
        UsedCar car6 = new UsedCar("GC", "Witherrel", 2016, 14450.00,3500.3);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
     
        while (true) {            
            // print the menu options
            int number = 1;
            for (Car car : carList) {
                // print the data aligning to left
                System.out.print(number+"."+car);
                UsedCar uc = null;
                // if car is an used car
                if (car instanceof UsedCar) {
                    uc=(UsedCar)car;
                    System.out.println(" (Used) "+app.formatValue(uc.getMileage())+" miles");
                }else System.out.println();
                number++;
            }
            // print the quit
            System.out.println(number+".Quit\n");
            System.out.print("Which car would you like? ");

            int selection = app.in.nextInt();
            // quit
            if (selection==number) {
                break;
            }else{
                Car car = carList.get(selection-1);
                UsedCar uc = null;
                System.out.print(car);
                // if car is an used car
                if (car instanceof UsedCar) {
                    uc=(UsedCar)car;
                    System.out.print(" (Used) "+app.formatValue(uc.getMileage())+" miles\n");
                }else System.out.println();
              
                System.out.print("Would you like to buy this car(y/n)? ");
                app.in.nextLine();
                // get the yes no option from the user
                String yes_no_option = app.in.nextLine();
                if (yes_no_option.equalsIgnoreCase("y") || yes_no_option.equalsIgnoreCase("yes")) {
                    System.out.println("Excellent! Our finance department will be in touch shortly!");
                    // remove this from the list
                    carList.remove(selection-1);
                
                }
                System.out.println(); // empty line
            }
            
        }
        System.out.println("Have a great day!");
      
    }
}
