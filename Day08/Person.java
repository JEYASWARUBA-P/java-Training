package Day08;

class Person {

    String name;

    Person(String name) {

        this.name = name;
    }

    void display() {

        System.out.println("Name : " + this.name);
    }

    public static void main(String[] args) {

        Person p = new Person("Ruba");

        p.display();
    }
}