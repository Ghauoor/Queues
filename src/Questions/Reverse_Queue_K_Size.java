package Questions;

import java.util.Queue;
import java.util.Stack;

public class Reverse_Queue_K_Size {
    public static Queue<Integer> reverseElements(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();

        //Step - I--> Put k value in stack from queue
        for (int i = 0; i < k; i++) {
            int val = q.peek();
            q.remove();
            st.push(val);
        }
        //Step - II--> Put k value in queue from stack
        while (!st.isEmpty()) {
            int val = st.peek();
            st.pop();
            q.add(val);
        }

        //Deal with remaining values
        int remVal = q.size() - k;

        while (remVal-- > 0) {
            int val = q.peek();
            q.remove();
            q.add(val);
        }

        return q;
    }
}
