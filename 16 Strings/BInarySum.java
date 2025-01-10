public class BInarySum {
    static String binarySum(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int i = ch1.length - 1, j = ch2.length - 1, carry = 0;
        StringBuilder s = new StringBuilder("");
        while (i >= 0 || j >= 0 || carry == 1){
            int num1 = i >= 0 ? ch1[i] - '0' : 0;
            int num2 = j >= 0 ? ch2[j] - '0' : 0;
            int sum = num1 + num2 + carry;
            int digit = sum % 2;
            carry = sum / 2;
            s.append((char)(digit + '0'));
            i -= 1; j -= 1;
        }
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(binarySum("101","11"));
    }
}
