package Day09;

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
