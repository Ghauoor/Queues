package Questions;
//https://leetcode.com/problems/gas-station/description/
//https://practice.geeksforgeeks.org/problems/circular-tour-1587115620/1
public class Gas_Station {
    public int canCompleteCircuit(int[] petrol, int[] distance) {
        int deficit = 0;
        int balance = 0;
        int start = 0;
        int n = petrol.length;

        for (int i = 0; i < n; i++) {
            balance += petrol[i] - distance[i];

            if (balance < 0) {
                deficit += balance;

                start = i + 1;
                balance = 0;
            }

        }

        if (deficit + balance >= 0) {
            return start;
        } else {
            return -1;
        }

    }
}
