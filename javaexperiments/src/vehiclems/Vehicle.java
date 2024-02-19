package vehiclems;

public abstract class Vehicle {
    private String vehicleNumber;

    public Vehicle(String vehicleNo){
        this.vehicleNumber=vehicleNo;
    }

     abstract void  move();

    public String getVehicleNumber(){
        return vehicleNumber;
    }

}
