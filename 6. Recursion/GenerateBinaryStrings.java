import java.util.Arrays;

public class GenerateBinaryStrings {
    static void generate(int index, char[] A, int k){
        if (index == k){
            System.out.println(Arrays.toString(A) + " ");
            return;
        }
        if (A[index - 1] == '0'){
            A[index] = '0';
            generate(index + 1, A, k);
            A[index] = '1';
            generate(index + 1, A, k);
        }
        else {
            A[index] = '0';
            generate(index + 1, A, k);
        }
    }
    static void fun(int k){
        char[] A = new char[k];
        A[0] = '0';
        generate(1, A, k);
        A[0] = '1';
        generate(1, A, k);
    }

    public static void main(String[] args) {
        fun(3);
    }
}
