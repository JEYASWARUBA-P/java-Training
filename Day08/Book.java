package Day08;

class Book {

    String title;
    double price;

    Book(String title, double price) {

        this.title = title;
        this.price = price;
    }

    void display() {

        System.out.println("Book : " + title);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args) {

        Book book = new Book("Java Programming", 599);

        book.display();
    }
}
