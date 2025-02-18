import java.util.Stack;

public class SmallestNumberfromDIString {
    public String smallestNumber(String pattern) {
        Stack<Integer> S = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i <= pattern.length(); i++){
            S.push(i + 1);
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!S.isEmpty()) sb.append(S.pop());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SmallestNumberfromDIString obj = new SmallestNumberfromDIString();
        System.out.println(obj.smallestNumber("IIIDIDDD"));
    }
}

/*LEETCODE : 2375
You are given a 0-indexed string pattern of length n consisting of the characters 'I' meaning increasing and 'D' meaning decreasing.

A 0-indexed string num of length n + 1 is created using the following conditions:

num consists of the digits '1' to '9', where each digit is used at most once.
If pattern[i] == 'I', then num[i] < num[i + 1].
If pattern[i] == 'D', then num[i] > num[i + 1].
Return the lexicographically smallest possible string num that meets the conditions.

Example 1:

Input: pattern = "IIIDIDDD"
Output: "123549876"
*/