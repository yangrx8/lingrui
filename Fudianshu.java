public class Fudianshu {
    public static void main(String[] args) {
        System.out.println("0.01 x 100 = " + (0.01 * 100));
        double sum = 0;
        for (int i = 1; i <= 100; i++) {  //循环，加100次
            sum = sum + 0.01;
        }
        System.out.println("0.01 加 100 次 = " + sum);  //用double类型存储小数，会出现精度问题
    }
}
