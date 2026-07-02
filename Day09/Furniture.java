package Day09;

class Furniture {

    void display() {
        System.out.println("Furniture Available");
    }
}

class Room {

    Furniture furniture = new Furniture();

    void showRoom() {
        System.out.println("Room Created");
        furniture.display();
    }
}

class House {

    Room room = new Room();

    public static void main(String[] args) {

        House house = new House();

        house.room.showRoom();
    }
}
