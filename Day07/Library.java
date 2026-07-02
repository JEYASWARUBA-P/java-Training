package Day07;

class Library {

    String bookName;
    String author;

    Library(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    void display() {
        System.out.println(bookName + " by " + author);
    }

    public static void main(String[] args) {

        Library book = new Library("Java", "James");

        book.display();
    }
}