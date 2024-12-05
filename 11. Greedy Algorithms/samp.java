import java.util.ArrayList;
import java.util.List;

public class samp {
    public static void main(String[] args) {
        System.out.println(generate(4));
    }
    static List<String> generate(int n){
        int size = n;
        List<String> list = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        while (getSize(n) < size){
            n += 1;
        }
        while (getSize(n) == size){
            list.add(tobinary(n));
            n += 1;
        }
        for (String str : list){
            if(!str.contains("11")) answer.add(str);
        }
        return answer;
    }
    static int getSize(int n){
        int size = (int)(Math.log(n) / Math.log(2)) + 1;
        return size;
    }
    static String tobinary(Integer n){
        return Integer.toBinaryString(n);
    }
}
