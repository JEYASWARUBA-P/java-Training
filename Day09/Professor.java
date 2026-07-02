package Day09;

class Professor {

    String name;

    Professor(String name) {
        this.name = name;
    }
}

class College {

    Professor professor;

    College(Professor professor) {
        this.professor = professor;
    }

    void display() {
        System.out.println("Professor : " + professor.name);
    }

    public static void main(String[] args) {

        Professor p = new Professor("James");

        College c = new College(p);

        c.display();
    }
}