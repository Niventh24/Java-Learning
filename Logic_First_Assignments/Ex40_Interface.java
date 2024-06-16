public class Ex40_Interface {
    public static void main(String[] args) {
        Mechanic m1=new Mechanic();
        Car c1=new Car();
        Bike b1=new Bike();
        m1.check(b1);
        m1.check(c1);
    }
    
}

class Vehicle{
    public void ride(){

    }
}

class Car extends Vehicle{
    public void ride(){
        System.out.println("You are riding a car");
    }
}

class Bike extends Vehicle{
    public void ride(){
        System.out.println("You are riding a bike");
    }
}

class Mechanic{
    public void check(Vehicle obj){
        System.out.println("checking");
        obj.ride();
    }
}
