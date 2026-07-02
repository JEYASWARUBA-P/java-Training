package Day09;

class Food {

    void order() {
        System.out.println("Food Ordered");
    }
}

class Pizza extends Food {

    @Override
    void order() {
        System.out.println("Pizza Ordered");
    }

    public static void main(String[] args) {

        Food food = new Pizza();

        food.order();
    }
}
