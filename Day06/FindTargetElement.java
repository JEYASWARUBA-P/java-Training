package Day06;
public class FindTargetElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Target Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Target Not Found");
    }
}
