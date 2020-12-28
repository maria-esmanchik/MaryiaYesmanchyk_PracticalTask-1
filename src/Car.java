public class Car {
	
	private String name = "Toyota";
	int power_reserve = 400;
	int passengers;
	int consumption = 10;
	int gallons;	
	
    public Car() {}

    public Car(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }    
    
    public int pessengerAmount(int seats) { 
    	passengers = seats - 1;
    	return passengers; 
	}	
    
    public void isEnoughFuel(int distance) { 
        if ((distance / consumption) > power_reserve) {
            System.out.println("We can go there!");
        } else {
           System.out.println("Need to refuel!");
        }  
   }
    
    public void voluemFuel() {    	
    	while(power_reserve != 0) {
    		power_reserve = power_reserve - consumption;
    		gallons++;
    	}
    	System.out.println("Voluem fuel " + gallons);
    }

    public void start() {
        System.out.println(name + " started!");
        System.out.println("Power reserve : " + power_reserve + "mi");
        System.out.println("Passengers " + passengers);
    }

}