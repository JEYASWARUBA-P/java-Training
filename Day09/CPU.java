package Day09;

class CPU {

    void process() {
        System.out.println("CPU Processing...");
    }
}

class Computer {

    CPU cpu = new CPU();

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.cpu.process();
    }
}