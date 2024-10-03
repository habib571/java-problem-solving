import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }

        return xor;
    }
}