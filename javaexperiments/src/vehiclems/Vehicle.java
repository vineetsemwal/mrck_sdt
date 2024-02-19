package vehiclems;

public class Vehicle {
    private String vehicleNumber;

    public Vehicle(String vehicleNo){
        this.vehicleNumber=vehicleNo;
    }

     void  move(){
        System.out.println(vehicleNumber+" vehicle moves");
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

}
