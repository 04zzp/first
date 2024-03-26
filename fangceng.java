package excise;

public class fangceng {
    private double a;
    private double b;

    public fangceng(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double solve() {
        if (a != 0) {
            return -b / a;
        } else {
            throw new IllegalArgumentException("a不能为0");
        }
    }

    public static void main(String[] args) {
        // 示例用法
        double a = 2;
        double b = 5;
        fangceng solver = new fangceng(a, b);
        double result = solver.solve();
        System.out.println("方程的解为: x = " + result);
    }
}
