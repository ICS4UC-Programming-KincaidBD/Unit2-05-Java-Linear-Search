import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("What number are you searching for in the list below? Enter 'q' to quit.");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = PopulateArray();
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.print("Number: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q")) {
            System.out.println("Exiting program.");
            return;
        } else {
            try {
                int target = Integer.parseInt(input);
                int index = linearSearch(numbers, target);
                if (index != -1) {
                    System.out.println("Number " + target + " found at index: " + index);
                } else {
                    System.out.println("Number " + target + " not found.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.close();
                return;
            }
        }
    }


    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] PopulateArray() {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        return numbers;
    }
}