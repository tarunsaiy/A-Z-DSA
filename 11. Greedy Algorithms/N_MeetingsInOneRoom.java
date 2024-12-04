import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class N_MeetingsInOneRoom {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2,4,5,7,9,9};
        System.out.println(nMeetings(start, end));
    }
    static int nMeetings(int[] start, int[] end){
        ArrayList<Meeting> arr = new ArrayList<>();
        for (int i = 0; i < start.length; i++){
            arr.add(new Meeting(start[i], end[i], i + 1));
        }
        MeetingComparator mc = new MeetingComparator();
        Collections.sort(arr, mc);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr.get(0).index);
        int freetime = arr.get(0).end;
        for (int i = 1; i < arr.size(); i++){
            if (arr.get(i).start > freetime){
                freetime = arr.get(i).end;
                ans.add(arr.get(i).index);
            }
        }
        return ans.size();
    }
}
class Meeting {
    int start, end, index;
    Meeting(int start, int end, int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }
}
class MeetingComparator implements Comparator<Meeting> {
    @Override
    public int compare(Meeting o1, Meeting o2){
        if(o1.end < o2.end) return -1;
        else if (o1.end > o2.end) return 1;
//        else if(o1.index < o2.index) return -1;
        return 1;
    }
}