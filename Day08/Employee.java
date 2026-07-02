package Day08;

class Employee {

    Employee() {

        this("Ruba");

        System.out.println("Default Constructor");
    }

    Employee(String name) {

        System.out.println("Employee Name : " + name);
    }

    public static void main(String[] args) {

        Employee e = new Employee();
    }
}
