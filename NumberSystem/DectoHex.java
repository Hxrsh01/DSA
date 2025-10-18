import java.util.Scanner;

public class DectoHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        // Characters used in hexadecimal representation
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        String hex = ""; // To store the hexadecimal result
        
        // Convert decimal to hex manually
        while (decimal > 0) {
            int remainder = decimal % 16;
            hex = hexChars[remainder] + hex;  // prepend the hex digit
            decimal = decimal / 16;
        }
        
        System.out.println("Hexadecimal value: " + hex);
    }
}
