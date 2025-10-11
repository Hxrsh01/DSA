public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 45, 99, 78, 99}; // sample array

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number (all elements are same).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}
