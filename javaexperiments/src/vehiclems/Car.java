package vehiclems;

public class Car extends Vehicle{

    public Car(String vehicleNo){
       super(vehicleNo);
    }

    @Override
    public void move() {
        System.out.println( getVehicleNumber()+" moves like a car");
    }
}
