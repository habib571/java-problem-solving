import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = {9}; // Example input
        int[] plusOne = new int[digits[0] != 9 ? digits.length : digits.length + 1];
        StringBuilder ch = new StringBuilder();

        for (int i : digits) {
            ch.append(i);
        }

        BigInteger number = new BigInteger(ch.toString());
        BigInteger sum = number.add(BigInteger.ONE);

        String result = sum.toString();

        for (int i = 0; i < result.length(); i++) {
            plusOne[i] = Character.getNumericValue(result.charAt(i));
        }

        System.out.println(Arrays.toString(plusOne));



    }


}   