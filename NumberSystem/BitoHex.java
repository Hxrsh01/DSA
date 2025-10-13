import java.util.Scanner;

public class BitoHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Validate input
        if (!binary.matches("[01]+")) {
            System.out.println("Invalid binary number!");
            sc.close();
            return;
        }

        // Convert binary to decimal manually
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }

        // Convert decimal to hexadecimal manually
        String hex = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        if (decimal == 0) {
            hex = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 16;
                hex = hexChars[remainder] + hex;
                decimal /= 16;
            }
        }

        System.out.println("Hexadecimal: " + hex);
        sc.close();
    }
}
