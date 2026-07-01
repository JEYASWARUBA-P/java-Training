package Day04;

public class DelayedArrival {

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {

        System.out.println(findDelayedArrivalTime(15, 5));
    }
}
