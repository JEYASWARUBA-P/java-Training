package Day08;

class College {

    void collegeName() {

        System.out.println("ABC Engineering College");
    }
}

class Department extends College {

    void departmentName() {

        System.out.println("Electronics and Communication Engineering");
    }

    public static void main(String[] args) {

        Department d = new Department();

        d.collegeName();
        d.departmentName();
    }
}
