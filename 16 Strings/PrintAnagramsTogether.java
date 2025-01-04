/*
* Given an array of strings, return all groups of strings that are
* anagrams. The strings in each group must be arranged in the order
* of their appearance in the original array. Refer to the sample case
* for clarification.
*
* Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
* */
import java.util.*;

public class PrintAnagramsTogether {
    static List<List<String>> printAnagrams(String[] S){
        Map<String, List<String>> map = new HashMap<>();
        for (String s : S){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedWord = String.valueOf(ch);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        return new ArrayList(map.values());
    }
    public static void main(String[] args) {

    }
}
