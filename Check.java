public class Check {
    public static void main(String[] args) {
        long a = 9000000000000000000L;
        long b = 9000000000000000000L;

// 方法1
        long result = a + b;
        if (result < 0) {
            System.out.println("溢出了！");
        } else {
            System.out.println("结果是 " + result);
        }

// 方法2
        if (b > Long.MAX_VALUE - a) {
            System.out.println("会溢出");
        } else {
            System.out.println("结果 " + (a + b));
        }
}
}
