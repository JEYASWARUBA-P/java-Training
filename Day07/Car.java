package Day07;

class Car {

    String model = "Swift";

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = null;
        Car c3 = new Car();

        System.out.println(c1); // Not allowed (uninitialized)
        // System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3.model);
    }
}
