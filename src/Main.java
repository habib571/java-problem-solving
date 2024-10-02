import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean isHappy = isHappy(19) ;
        System.out.print(isHappy);


    }
    static boolean isHappy(int n)
    {
        int l=0,sum=0;
        while(n>0)
        {
            l=n%10;
            sum=sum+(l*l);
            n=n/10;
        }
        if (sum==1)
            return true;
        else if(sum==7) //only one happy number(7) b/w 1 and 10
            return true;
        else if(sum<10)
            return false;
        else
            return isHappy(sum);


    }
}