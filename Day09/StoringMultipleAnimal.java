package Day09;

class Animal {

    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat");
    }

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal a : animals) {
            a.sound();
        }
    }
}
