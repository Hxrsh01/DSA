import java.util.Arrays;
public class SumOfDigit {
    public static int[] sumDigitsAsArray(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        int count = 0;
        int tempSum = sum;
        while (tempSum != 0) {
            count++;
            tempSum /= 10;
        }
        int[] result = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            result[i] = sum % 10;
            sum /= 10;
        }

        return result;
    }
    public static void main(String[] args) {
        int number = 999999999; // example number
        int[] result = sumDigitsAsArray(number);

        System.out.println("Sum of digits in array form: " + Arrays.toString(result));
        // Output: [1, 0] because 1+2+3+4 = 10
    }
}
