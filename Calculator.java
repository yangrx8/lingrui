import java.util.Scanner;    //借用工具
public class Calculator {    //类名
    public static void main(String[] args) {  //主方法
        Scanner scan = new Scanner(System.in);  //创建Scanner对象
        System.out.println("给我第一个数字："); //提示用户输入第一个数字
        long a = scan.nextLong();    //接收用户输入的第一个数字
        System.out.println("快输入运算符(只能输+-*/哦):");  //提示用户输入运算符
        String yunsuanfu = scan.next();   //接收用户输入的运算符
        System.out.println("我要第二个数字：");    //提示用户输入第二个数字
        long b = scan.nextLong();    //接收用户输入的第二个数字
        long result = 0;     //定义结果来存储计算结果，必须等于0，否则会报错，跟c语言不一样，c语言可以不赋值，java必须赋值
        switch (yunsuanfu) {    //根据运算符进行不同的计算
            case "+":      //如果是加法
                result = a + b;  //计算结果
                break;
            case "-":      //如果是减法
                result = a - b;        //计算结果
                break;      //如果是乘法
            case "*":   //如果是乘法
                result = a * b;    //计算结果
                break;
            case "/":    //如果是除法
                if(b == 0) {    //如果除数等于0
                    System.out.println("被除数不能等于0哦");     //提示用户除数不能等于0
                    return;     //结束程序
                } else {    //如果除数不等于0
                    result = a / b;    //计算结果
                }
                break;
            default:           //因为这个格式问题卡了我好久，这个只能空12格，我之前空了16格，导致报错，真是坑啊
                System.out.println("不能输这个符号哦");  //提示用户不能输入这个符号
                return;   //结束
        }
        System.out.println("计算的结果是" + result);
    }
}
