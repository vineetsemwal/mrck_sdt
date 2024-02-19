package vehiclems;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car=new Car("KL86266");//object is of car
        car.move();// this is resolved at the runtime and not compiletime
        //runtime polymorphism


    }
}
