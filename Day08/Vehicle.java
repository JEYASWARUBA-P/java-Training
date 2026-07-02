package Day08;

class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is Running");
    }

    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.start();
        bike.ride();
    }
}