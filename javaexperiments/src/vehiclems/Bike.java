package vehiclems;

public class Bike extends Vehicle{
    public Bike(String vehicleNumber){
        super(vehicleNumber);
    }

    @Override
    void move() {
        System.out.println( getVehicleNumber()+" moves like a bike");
    }
}
