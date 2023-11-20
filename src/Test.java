import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-19
 * Time: 18:53
 */
//无符号右移 >>> 补零
// if（语句），不能是一个符号
//良好的编程习惯
//1.注释
//2.命名规则的遵守
//可读性高，性能好
//不能做switch 参数的数据类型
//long float double boolean
//while(布尔表达式）
//continue 直接进行下一次循环
//当你输入的数据 有很多不同类型时，优先处理字符串的输入
//    ctrl+d 结束循环
// 生成随机数
public class Test {
    public static void main(String[] args) {
        //猜数字
        Random random = new Random();
        int n = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num>n){
                System.out.println("猜大了");
            }
            else if(num<n){
                System.out.println("猜小了");
            }
            else{
                System.out.println("猜对了");
                break;
            }
        }

    }
    public static void main11(String[] args) {
        Random random = new Random();
        //int n = random.nextInt(100)+1;//[1,101)
        int n = random.nextInt(50)+50;//[50,100)
        System.out.println(n);
    }
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            System.out.println("输入你的姓名: ");
            String name = scan.nextLine();
            System.out.println("姓名: "+name);
        }
    }
    public static void main9(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            System.out.println("输入你的年龄: ");
            int age = scan.nextInt();
            System.out.println("年龄: "+age);
        }
    }
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入你的姓名: ");
        String name = scan.nextLine();
        System.out.println("输入你的年龄: ");
        int age = scan.nextInt();
        System.out.println("输入你的工资: ");
        float money = scan.nextFloat();
        System.out.println("姓名: "+name);
        System.out.println("年龄: "+age);
        System.out.println("工资: "+money);
        scan.close();
    }
    public static void main7(String[] args) {
        //alt+回车
        Scanner scan = new Scanner(System.in);
        //int a=10;
        System.out.println("输入你的年龄: ");
        int age = scan.nextInt();
        System.out.println("年龄: "+age);
        System.out.println("输入你的姓名");
        //String name = scan.nextLine();//读一行，读进了回车,会失效
        String name =scan.next();//读到空格就结束
        System.out.println("姓名: "+name);
    }
    public static void main6(String[] args) {
        System.out.println(10);//输出且换行
        System.out.print("不换行 ");
        System.out.printf("%s","这是格式化输出! ");
    }
    public static void main5(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                continue;
            }
        }
    }
    public static void main4(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 5) {
            int ret = 1;
            for (int j = i; j > 0 ; j--) {
                ret *= j;
            }
            sum += ret;//加每个阶乘的值
            i++;
        }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        int sumOdd = 0;
        int sumEve = 0;
        for (int i = 0; i <= 100; i += 2) {
            sumEve += i;//加0不影响和
            if(i != 100){//最后一次循环防止加101
                sumOdd += i + 1;
            }
        }
        int sum=sumEve+sumOdd;
        System.out.println("总和 " + sum);
        System.out.println("奇数 " + sumOdd);
        System.out.println("偶数 " + sumEve);
    }
    public static void main2(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    public static void main1(String[] args) {
         int a=1;
         switch(a){
             case 1:
                 System.out.println("one");
                 break;
             case 2:
                 System.out.println("two");
                 break;
             default:
                 System.out.println("错误");
                 break;
         }
    }
}
