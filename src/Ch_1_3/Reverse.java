package Ch_1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        while(!StdIn.isEmpty()){
            stack.push(StdIn.readInt());
        }
        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}
