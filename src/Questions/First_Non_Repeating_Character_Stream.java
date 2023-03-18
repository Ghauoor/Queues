package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class First_Non_Repeating_Character_Stream {
    public String FirstNonRepeating(String A) {
        int[] count = new int[26];
        StringBuilder ans = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            q.add(ch);
            count[ch - 'a']++;

            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                //repeating char
                q.remove();
            }
            if (q.isEmpty()) {
                ans.append("#");
            } else {
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }

}
