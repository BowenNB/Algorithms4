package Ch_1_3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class QueueTest {

    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> q = new Queue<>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }

        int N = q.size();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = q.dequeue();
        }
        return arr;
    }

    public static void main(String[] args) {
        String file = "data.txt";
        int[] ints = readInts(file);

        for (int num : ints) {
            System.out.println(num);
        }

    }
}
