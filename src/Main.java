import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {


}
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stk= new Stack<>();
        ListNode curr = head ;
        while (curr!= null) {
             stk.push(curr.val) ;
            curr = curr.next;
        }
        curr = head ;
        while (!stk.isEmpty()) {
            if(curr.val != stk.peek())   {
                 return  false ;
            }
            else {
                stk.pop() ;
                curr =curr.next ;

            }


        }
    return  true ;
    }

}

