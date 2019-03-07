package fibonacciNumber;

import java.util.Map;

/**
 * @author Yasin Zhang
 */
public class Matrix2 {

    private int l1;
    private int r1;
    private int l2;
    private int r2;

    public Matrix2(int l1, int r1, int l2, int r2) {
        this.l1 = l1;
        this.r1 = r1;
        this.l2 = l2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "[ " + l1 + " " + r1 + " ]" + "\r\n" +
               "[ " + l2 + " " + r2 + " ]";
    }

    public int getL1() {
            return l1;
        }

        public void setL1(int l1) {
            this.l1 = l1;
        }

        public int getR1() {
            return r1;
        }

        public void setR1(int r1) {
            this.r1 = r1;
        }

        public int getL2() {
            return l2;
        }

        public void setL2(int l2) {
            this.l2 = l2;
        }

        public int getR2() {
            return r2;
        }

        public void setR2(int r2) {
            this.r2 = r2;
        }

}
