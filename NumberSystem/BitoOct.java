import java.util.Scanner;

public class BitoOct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Step 1: Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Step 2: Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal equivalent: " + octal);
        
        sc.close();
    }
}
