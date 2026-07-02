package Day08;

class Employee {

    int id;                      // Instance Variable

    static String company = "ABC Technologies"; // Static Variable

    void display() {

        int salary = 30000;      // Local Variable

        System.out.println("ID : " + id);
        System.out.println("Company : " + company);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.id = 101;

        e.display();
    }
}
