package Day07;

class Laptop {

    String brand = "Dell";
    int ram = 16;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        laptop.display();
    }
}
