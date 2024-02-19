package vehiclems;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle car=new Car("KL86266");//object is of car
        car.move();// this is resolved at the runtime and not compiletime
        //runtime polymorphism
        Vehicle bike=new Bike("TL837763");
        bike.move();
        int count=Vehicle.getVehiclesCount();
        System.out.println("count="+count);
        print(bike);

    }

    public static void print(Vehicle vehicle){
        System.out.println(vehicle.getVehicleNumber());
    }
}
