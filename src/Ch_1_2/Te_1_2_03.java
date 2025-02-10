package Ch_1_2;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class Te_1_2_03 {

    public static void show(int N, double min, double max) {

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Interval2D[] interval2DS = new Interval2D[N];
        for(int i = 0; i < N; i++){
            double x1 = StdRandom.uniform(min, max);
            double x2 = StdRandom.uniform(x1, max);
            double y1 = StdRandom.uniform(min, max);
            double y2 = StdRandom.uniform(y1, max);
            StdOut.printf("%.3f %.3f %.3f %.3f\n", x1 ,x2, y1, y2);
            interval2DS[i] = new Interval2D(new Interval1D(x1, x2), new Interval1D(y1, y2));
            interval2DS[i].draw();
        }

        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                StdDraw.setPenColor(Color.RED);
                StdDraw.setPenRadius(0.01);
                if(interval2DS[i].intersects(interval2DS[j])){
                    interval2DS[i].draw();
                    interval2DS[j].draw();
                    StdOut.println("intersects: " + interval2DS[i] + " " + interval2DS[j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();

        show(N, min, max);

        double x1 = 0.1;
        double x2 = 0.2;
        double y1 = 1;
        Interval2D interval2D = new Interval2D(new Interval1D(x1, x2), new Interval1D(x1, y1));
        interval2D.draw();

        interval2D = new Interval2D(new Interval1D(x1, x2), new Interval1D(x2, 0.6));
        StdDraw.setPenColor(Color.RED);
        interval2D.draw();


    }
}
