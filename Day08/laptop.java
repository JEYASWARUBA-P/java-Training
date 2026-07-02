package Day08;

class Laptop {

    String brand;
    int ram;

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram + " GB");
    }

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Dell", 16);

        laptop.display();
    }
}
