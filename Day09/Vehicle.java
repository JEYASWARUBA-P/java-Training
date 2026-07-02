package Day09;

class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike Started");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Bike(),
                new Car()
        };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}