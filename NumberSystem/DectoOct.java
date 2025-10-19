public class DectoOct {
    public static void main(String[] args) {
        int decimal = 100; // You can change this number
        int octal = 0, i = 1;

        int temp = decimal;
        while (temp != 0) {
            int remainder = temp % 8;
            octal += remainder * i;
            i *= 10;
            temp /= 8;
        }

        System.out.println("Decimal number: " + decimal);
        System.out.println("Octal number: " + octal);
    }
}
