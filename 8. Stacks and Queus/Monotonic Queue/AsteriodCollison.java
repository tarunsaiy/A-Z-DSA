import java.util.Arrays;
import java.util.Stack;

public class AsteriodCollison {
    public static void main(String[] args) {
        int[] arr= {7,4,5,1,2,-6,7,-7,1};
        System.out.println(Arrays.toString(asteriod(arr)));
    }
    static int[] asteriod(int[] asteriod){
        Stack<Integer> s = new Stack<>();
        for(int a : asteriod){
            if(a > 0) s.push(a);
            else{
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < -a) s.pop();
                if(s.isEmpty() || s.peek() < 0) s.push(a);
                if(s.peek() == -a) s.pop();
            }
        }
        int[] arr = new int[s.size()];
        int ind = s.size() - 1;
        for(int i = ind; i >= 0; i--){
            arr[i] = s.pop();
        }
        return arr;
    }
}
