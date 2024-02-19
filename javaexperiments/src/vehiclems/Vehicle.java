package vehiclems;

public abstract class Vehicle {
    private static int vehiclesCount;

    private String vehicleNumber;

    public Vehicle(String vehicleNo){
        this.vehicleNumber=vehicleNo;
        vehiclesCount++;
    }

     abstract void  move();

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public static int getVehiclesCount() {
        return vehiclesCount;
    }
}
