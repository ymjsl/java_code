/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-16
 * Time: 10:38
 */
public class Test {
    public static void main(String[] args) {
        String str ="1234";
        int a=Integer.parseInt(str);
        System.out.println(a+1);
        int b=Integer.valueOf(str);
        System.out.println(b+1);
    }
    public static void main10(String[] args) {
        int a=10;
        String str=a+"";
        System.out.println(str);
        //借助方法
        String ret=String.valueOf(10);
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        String s1="hello";
        String s2="world";
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println("a:"+a +" b:"+b);
        //                  a: 10    b: 20
        //当字符串和整数在一起使用+号的时候 就是拼接的意思
        System.out.println("a: "+a + b);
        //                  a:  1020
        System.out.println(a+b+"a: b:");
        //                 30   a: b:
        System.out.println(s1+s2);//表示拼接
    }
    public static void main1(String[] args) {
        byte a=10;
        byte b=20;
        //当你参与运算的数据 小于4个字节的时候 ，会进行提升（byte,short,char
        //byte c=a+b;
        int c=a+b;
    }
    public static void main7(String[] args) {
        int a=10;
        long b=20;
        //int c=a+b;//整型提升为long,不能小转大
        int c=(int)(a+b);
        char m=10;
        char n=20;
        //char k=m+n; erroneous
    }
    public static void main5(String[] args) {
        int a=97;
        char ch=(char)a;
        double d = 97.8;
        char ch2 = (char)d;
        System.out.println(ch);
        System.out.println(ch2);
    }
    public static void main4(String[] args) {
        int a=10;
        long b=100L;
        //b=a; // 隐式类型转换
        //a=b erroneous
        a=(int)b;
        System.out.println(a);
    }
    public static void main3(String[] args) {
        boolean b=true;
        System.out.println(b);
    }
}
    /*public static void main2(String[] args) {
        *//*byte b=10;
        System.out.println(b);
        double d=12.5;//双精度浮点型
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        float f=12.5f;
        System.out.println(f);*//*
        int a=1;
        int b=2;
        System.out.println((double)a/b);
        double d=1.1;
        System.out.println(d*d);
        System.out.println(Character.MAX_VALUE);
    }
}*/
//c语言 ：ASCII字符集
//java: Unicode字符集
//布尔型变量 只有true 或 false
//无明确大小
//int boolean 不能相互转换
//int  Integer
//char  Character
//小转大可以
//大转小要强转  不相关的不能转
//字符串类型 String