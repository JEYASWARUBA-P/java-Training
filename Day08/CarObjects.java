package Day08;

class Car {

    String model;

    Car(String model) {

        this.model = model;
    }

    void display() {

        System.out.println(model);
    }

    public static void main(String[] args) {

        Car c1 = new Car("Swift");
        Car c2 = new Car("Creta");
        Car c3 = new Car("City");

        c1.display();
        c2.display();
        c3.display();

        System.out.println("Each object is stored separately in Heap Memory.");
    }
}