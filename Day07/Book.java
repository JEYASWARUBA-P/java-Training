package Day07;

class Book {

    String title = "Java Programming";

    void display() {
        System.out.println("Book: " + title);
    }

    public static void main(String[] args) {

        Book b = new Book();

        b.display();
    }
}
