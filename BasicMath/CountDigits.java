public class CountDigits {
    public static void main(String[] args) {
      int n = 4;
      double noOfDigits = Math.log(n) / Math.log(10);
      double noOfBinaryDigits = Math.log(n) / Math.log(2);
      System.out.println((int)noOfDigits + 1);
      System.out.println((int) noOfBinaryDigits + 1);
    }
}
