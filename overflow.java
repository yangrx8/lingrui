public class overflow {
    public static void main(String[] args) {
        long max = Long.MAX_VALUE;
        System.out.println("long 的最大值：" + max);
        System.out.println("最大值 + 1:" + (max + 1));
        System.out.println("9x10^18 + 9x10^18:" + (9000000000000000000L + 9000000000000000000L));
    }
}
