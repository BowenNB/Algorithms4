package Ch_1_2;

import tools.ArrayGenerator;

public class Te_1_2_18 {

    public static class _Accumulator {

        private double m;
        private double s;
        private int N;

        public void addDataValue(double x) {
            N++;
            s = s + 1.0 * (N - 1) / N * (x - m) * (x - m); // 递推公式没太看懂
            m = m + (x - m) / N;
        }

        public double mean() {
            return m;
        }

        public double var() {
            return s / (N - 1); // 样本数减1
        }

        public double stddev() {
            return Math.sqrt(this.var());
        }
    }

    public static double normalMean(double[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static double normalVar(double[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - normalMean(a)) * (a[i] - normalMean(a));
        }
        return sum / (a.length - 1);
    }

    public static void main(String[] args) {
        _Accumulator acc = new _Accumulator();

        double[] a = ArrayGenerator.randomDoubleArray(10, 10000);

        for (int i = 0; i < a.length; i++) {
            acc.addDataValue(a[i]);
        }
        System.out.println(acc.mean());
        System.out.println(acc.var());

        System.out.println("==============");

        double mean = normalMean(a);
        double var = normalVar(a);
        System.out.println(mean);
        System.out.println(var);
    }
}
