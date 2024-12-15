/*Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.
GFG: https://www.geeksforgeeks.org/problems/count-digits5716/1
* */
public class CountDigits {
    public static void main(String[] args) {
      int n = 4;
      double noOfDigits = Math.log(n) / Math.log(10);
      double noOfBinaryDigits = Math.log(n) / Math.log(2);
      System.out.println((int)noOfDigits + 1);
      System.out.println((int) noOfBinaryDigits + 1);
    }
}
