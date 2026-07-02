package Day09;

class School {

    void schoolName() {
        System.out.println("ABC Public School");
    }
}

class Student extends School {

    void studentName() {
        System.out.println("Student : Ruba");
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.schoolName();
        s.studentName();
    }
}