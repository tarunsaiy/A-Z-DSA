public class ShiftingCharacters {
    static String shiftingCharacters(String str, int[][] shifts){
        char[] ch = str.toCharArray();
        int n = str.length();
        int[] prefixSum = new int[n];
        for (int[] i : shifts){
            int start = i[0], end = i[1], direction = i[2];
            prefixSum[start] += (direction == 1 ? 1 : -1);
            if(end + 1 < n) prefixSum[end] += (direction == 1 ? -1 : 1);
        }
        for (int i = 1; i < n; i++){
            prefixSum[i] += prefixSum[i - 1];
        }
        for (int i = 0; i < n; i++){
            ch[i] = (char)((((ch[i] - 'a' + prefixSum[i]) % 26) + 26) % 26 + 'a');
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String str = "abc";
        int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingCharacters(str, shifts));
    }
}
