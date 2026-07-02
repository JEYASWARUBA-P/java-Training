package Day07;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ruba");
        Employee e2 = new Employee(102, "Kumar");
        Employee e3 = new Employee(103, "Anu");

        e1.display();
        e2.display();
        e3.display();

        System.out.println("Each Employee object is stored in Heap Memory.");
        System.out.println("Reference variables (e1, e2, e3) are stored in Stack Memory.");
    }
}
