public class DectoBi {
    public static void main(String[] args) {
        int decimal = 10; // Change number here
        String binary = "";
        
        if(decimal == 0) {
            binary = "0";
        } else {
            while(decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal /= 2;
            }
        }
        
        System.out.println("Binary: " + binary);
    }
}