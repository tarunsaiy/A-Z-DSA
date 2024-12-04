import java.util.HashMap;

public class LemonadeChange {
    public static void main(String[] args) {

    }
    static boolean possible(int[] arr){
        int five = 0, ten = 0;
        for (int i : arr){
            if (i == 5) five += 1;
            else if (i == 10){
                if(five > 0) {
                    five -= 1;
                    ten += 1;
                }
                else return false;
            }
            else {
                if(ten > 0 && five > 0){
                    five -= 1;
                    ten -= 1;
                }
                else if(five >= 3){
                    five -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}
