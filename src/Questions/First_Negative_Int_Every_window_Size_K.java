package Questions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class First_Negative_Int_Every_window_Size_K {
    public static long[] printFirstNegativeInteger(long A[], int N, int K) {
        Deque<Long> dq = new LinkedList<>();
        long[] ans = new long[N - K + 1];

        // process first window
        for (int i = 0; i < K; i++) {
            if (A[i] < 0) {
                dq.addLast(A[i]);
            }
        }
        // push ans for FIRST window
        if (!dq.isEmpty()) {
            ans[0] = dq.peekFirst();
        } else {
            ans[0] = 0;
        }
        // now process for remaining windows
        for (int i = K; i < N; i++) {
            // first pop out of window element
            if (!dq.isEmpty() && dq.peekFirst() == A[i - K]) {
                dq.removeFirst();
            }

            // then push current element
            if (A[i] < 0) {
                dq.addLast(A[i]);
            }
            // put in ans
            if (!dq.isEmpty()) {
                ans[i - K + 1] = dq.peekFirst();
            } else {
                ans[i - K + 1] = 0;
            }
        }
        return ans;
    }
}

class Compute {
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        int i = 0, j = 0;
        Queue<Long> q = new LinkedList<>();
        long result[] = new long[N - K + 1];
        int idx = 0;
        while (j < N) {
            if (A[j] < 0) q.add(A[j]);

            if (j - i + 1 == K) {

                if (q.size() == 0) {
                    result[idx++] = 0;

                } else {

                    result[idx++] = q.peek();
                    if (A[i] == q.peek()) {
                        q.poll();
                    }
                }

                i++;
            }

            j++;
        }
        return result;

    }

}
