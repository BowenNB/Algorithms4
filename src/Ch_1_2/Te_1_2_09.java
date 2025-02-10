package Ch_1_2;

import edu.princeton.cs.algs4.StdOut;
import tools.ArrayGenerator;
import tools.PrintUtil;

public class Te_1_2_09 {

    public static int rank(int key, int[] a, _Counter cnt) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            cnt.increment();
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _Counter cnt = new _Counter("binary search");
        int[] a = ArrayGenerator.ascInts(100);
        int[] keys = ArrayGenerator.randomIntsArray(150);
        PrintUtil.show(keys);
        for (int key : keys) {
            if(rank(key, a, cnt)<0){
                StdOut.println(key);
            }
        }
        System.out.println(cnt);

    }
}