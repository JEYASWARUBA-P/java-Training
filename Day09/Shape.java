package Day09;

class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {

        Shape shape = new Circle();

        shape.draw();
    }
}
