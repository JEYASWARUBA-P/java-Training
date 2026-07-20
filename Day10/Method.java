package Day10;

public class Method {

    public static void main(String[] args) {

        Animal a = new Animal();

        a.sound();
    }
}
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}