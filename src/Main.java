import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

   int[] nums = {2,7,11,15} ;
    int[] out = new int[2] ;
    int tar = 2 ;
    for (int i = 0  ; i < nums.length ; i++ ) {
        for (int j= i+1 ; j < nums.length ; j++ ) {
            if(nums[i] +nums[j] == tar) {
                out[0] = i ;
                out[1] = j ;
            }

        }


    }
    System.out.println(Arrays.toString(out));

    }
}