import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-17
 * Time: 17:40
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for ( int year = 1000; year <=num; year++) {
            if(year%100!=0){
                if(year%4==0){
                    System.out.println(year+" is leapYear");
                }
            }
            else if(year%400==0){
                System.out.println(year+" is leapYear");
            }
        }
    }
    public static void main11(String[] args) {
        //工具
        Scanner scanner = new Scanner(System.in);
                                      //键盘
        int a=scanner.nextInt();
    }
    public static void main10(String[] args) {
        int a=10;
        if(a%2==0){
            System.out.println("偶数");
        }
        else{
            System.out.println("奇数");
        }
    }
    public static void main9(String[] args) {
        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");*/
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1);
        }
    }
    //if(布尔表达式){

    //}
    public static void main8(String[] args) {
        int a=10;
        int b=20;
        //a>b?a:b; errnoeous 不是语句
        int c=a+((b-a)>>1);
        System.out.println(c);
    }
    public static void main7(String[] args) {
        //System.out.println(10>20&10/0==0);//errnoeous
        //System.out.println(10<20|10/0==0);//errnoeous
        System.out.println(10<20|10>0);
        System.out.println(-1>>1);//-1 //右移补1
        System.out.println(-1>>>1);//无符号右移，右移补0  2147483647
    //不存在<<<
    }
    public static void main6(String[] args) {
        int a=10;
        int b=11;
        System.out.println(a>b);//得出的结果为true或false
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>5&&a<10);
        //如果第一个表达式为假，不执行第二个
    }
    public static void main5(String[] args) {
        int a=10;
        int b=++a;
        System.out.println(b);
        System.out.println(a);
    }
    public static void main4(String[] args) {
        int a = 10;
        a += 1;
        double d=12.5;
        //a = a + d; errnoeous
        a+=d;//双目操作符自动类型转换
        System.out.println(a);
    }
    public static void main3(String[] args) {
        System.out.println(12.5 % 10.5);
        System.out.println(11 % 10.5);
    }
    public static void main2(String[] args) {
        System.out.println(10%3);
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);
    }
    public static void main1(String[] args) {
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5/2.0);
        System.out.println((float)5/2);
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));
    }
    //异或 ^
    //相同为0 ，相异为1
}
