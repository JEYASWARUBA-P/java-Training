package Day07;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Ruba");
        Student s2 = new Student(2, "Priya");
        Student s3 = new Student(3, "Kavi");

        s1.display();
        s2.display();
        s3.display();
    }
}