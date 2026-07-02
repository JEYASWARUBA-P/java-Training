package Day09;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Lion extends Animal {

    @Override
    void sound() {
        System.out.println("Lion Roars");
    }

    public static void main(String[] args) {

        Animal animal = new Lion();

        animal.sound();
    }
}
