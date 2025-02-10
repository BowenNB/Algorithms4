package Ch_1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;



public class Te_1_2_10 {

    public static class _VisualCounter{

        private int N;
        private int max;
        private int cnt;
        private int opts;

        public _VisualCounter(int N, int max){
            this.N = N;
            this.max = max;
            StdDraw.setXscale(0, N);
            StdDraw.setYscale(-max, max);
        }

        public void increment(){
            if(opts < N){
                opts++;
            }
            if(cnt < max){
                cnt++;
            }
            draw();
        }

        public void decrement(){
            if(opts < N){
                opts++;
            }
            if(cnt > (-max)){
                cnt--;
            }
            draw();
        }

        private void draw(){
            StdDraw.setPenRadius(0.01);
            StdDraw.setPenColor(Color.RED);
            StdDraw.point(opts, cnt);
        }
        
        public int tally(){
            return cnt;
        }
    }

    public static void main(String[] args) {
        _VisualCounter vs = new _VisualCounter(100, 50);
        for (int i = 0; i < 100; i++) {
            if(StdRandom.bernoulli(0.45) == true){
                vs.increment();
            } else {
                vs.decrement();
            }
        }
    }
}
