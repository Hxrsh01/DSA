public class BitoDec {
    public static void main(String[] args) {
        int binary = 1011; // example binary number
        int decimal = 0;
        int base = 1; // 2^0

        int temp = binary;
        while (temp > 0) {
            int lastDigit = temp % 10;
            decimal += lastDigit * base;
            base = base * 2;
            temp = temp / 10;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}
