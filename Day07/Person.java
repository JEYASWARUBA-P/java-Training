package Day07;

class Person {

    void display() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {

    @Override
    void display() {
        System.out.println("I am a Student");
    }

    public static void main(String[] args) {

        Person p = new Student();

        p.display();
    }
}
