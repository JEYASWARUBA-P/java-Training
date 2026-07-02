package Day07;

class Customer {

    String name;

    Customer(String name) {
        this.name = name;
    }
}

class Product {

    String productName;

    Product(String productName) {
        this.productName = productName;
    }
}

class Order {

    Customer customer;
    Product product;

    Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    void display() {
        System.out.println(customer.name + " ordered " + product.productName);
    }

    public static void main(String[] args) {

        Customer c = new Customer("Ruba");
        Product p = new Product("Laptop");

        Order order = new Order(c, p);

        order.display();
    }
}
