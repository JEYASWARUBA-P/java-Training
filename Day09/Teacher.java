package Day09;

class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {

    Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Teacher : " + teacher.name);
    }

    public static void main(String[] args) {

        Teacher t = new Teacher("Ravi");

        Department d = new Department(t);

        d.display();
    }
}