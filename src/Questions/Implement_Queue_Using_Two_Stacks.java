package Questions;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/description/
public class Implement_Queue_Using_Two_Stacks {
    Stack<Integer> stackOne;
    Stack<Integer> stackTwo;

    public Implement_Queue_Using_Two_Stacks() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }

    //Push
    public void push(int val) {
        stackTwo.push(val);
    }

    //Pop
    public int pop() {
        if (stackOne.isEmpty()) {
            while (!stackTwo.isEmpty()) {
                stackOne.push(stackOne.peek());
                stackTwo.pop();
            }
        }
        int val = stackOne.peek();
        stackOne.pop();
        return val;
    }

    public int peek() {
        if (stackOne.isEmpty()) {
            while (!stackTwo.isEmpty()) {
                stackOne.push(stackOne.peek());
                stackTwo.pop();
            }
        }

        return stackOne.peek();
    }

    public boolean empty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }

}
