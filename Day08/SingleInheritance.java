package Day08;

class Shape {

    void draw() {

        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    void area() {

        System.out.println("Area of Circle");
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
        c.area();
    }
}
