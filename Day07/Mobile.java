package Day07;

class Mobile {

    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Mobile mobile1 = new Mobile("Samsung", "Galaxy A35", 28999);
        Mobile mobile2 = new Mobile("Realme", "Narzo 70", 17999);

        mobile1.display();
        mobile2.display();
    }
}
