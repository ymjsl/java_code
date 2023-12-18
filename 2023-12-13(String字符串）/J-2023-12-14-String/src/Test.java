import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-14
 * Time: 20:08
 */
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer);
        String s = stringBuffer.toString();
        System.out.println(s);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
    public static void main15(String[] args) {
        String str ="abcd";
        StringBuilder stringbuffer = new StringBuilder();
        stringbuffer.append(str);
        for (int i = 0; i < 100; i++) {
            stringbuffer.append(i);
        }
        System.out.println(stringbuffer);
    }
    public static void main14(String[] args) {
        final int[] array = {1,2,3,4};//指向不能改变
        //array= new int[10];
        array[0]=88;
    }
    public static void main13(String[] args) {
        char[] ch = new char[]{'a','b','c'};
        String s1 =new String(ch);//不在常量池
        //s1.intern();//会将s1对象的引用放入常量池中
        String s2 = "abc";
        System.out.println(s1==s2);//false6
    }
    public static void main12(String[] args) {
        //字符串常量池
        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = new String("abcd");
        String str4 = new String("abcd");
        System.out.println(str1==str2);
        System.out.println(str3==str4);
    }
    public static void main11(String[] args) {
        String str = "abcdefcdef";
        System.out.println(str.endsWith("cdef"));//是否以这个字符串结尾
        System.out.println(str.startsWith("abc"));
    }
    public static void main10(String[] args) {
        String str = " hello hello     ";
        String ret = str.trim();//去掉左右两边的空格
        System.out.print(ret);
        System.out.println("ppppppp");
        String str2 = "hello sfafs";
        boolean flag = str2.contains("hello");
        System.out.println(flag);
    }
    public static void main9(String[] args) {
        //字符串截取
        String str = "helloworld";
        String ret = str.substring(1);
        System.out.println(ret);
        String ret2 =str.substring(1,3);
    }
    public static void main8(String[] args) {
        //字符串拆分
        String str = "abcd&efg";
        String[] ret = str.split("&");
        System.out.println(Arrays.toString(ret));
        System.out.println("=============");
        String str2 = "127.0.0.1";
        // \ 转义符号
        String[] ret2 = str2.split("\\.");
        for (String x:ret2) {
            System.out.println(x);
        }
        System.out.println("=================");
        String str3 = "127\\0\\0\\1";
        String[] ret3 = str3.split("\\\\");
        for (String x:ret3) {
            System.out.println(x);
        }
        String str4 = "name=zhangsan&age=18";
        String[] ret5 = str4.split("=|&");
        //分割两个字符
        for (String x: ret5) {
            System.out.println(x);
        }
    }
    public static void main7(String[] args) {
        //字符串替换
        String str1 = "abcbadba";
        String ret = str1.replace('a','p');
        System.out.println(ret);
        String ret2 = str1.replace("ab","pk");
        System.out.println(ret2);
        String ret3 = str1.replaceAll("abc","pk");
        System.out.println(ret3);
        String ret4 = str1.replaceFirst("ba","GG");
        System.out.println(ret4);
    }
    public static void main6(String[] args) {
        //类型转换
        String str = "hello";
        String str2 = str.toUpperCase();
        System.out.println(str2);
        String str3 = "ABCDEF";
        String ret = str3.toLowerCase();
        System.out.println(ret);
        System.out.println("==================");
        char[] chars = str2.toCharArray();
        System.out.println(Arrays.toString(chars));//字符串转数组
        String s2 = new String(str);
        System.out.println(s2);//数组转字符串
        String ret4 = String.format("%d-%d-%d",2019,9,14);
        System.out.println(ret4);//格式化字符串

    }
    public static void main5(String[] args) {
        String str = String.valueOf(123);
        System.out.println(str);//int-->String
        String str2 = String.valueOf(true);
        System.out.println(str2);//boolean-->String
        String s4 = String.valueOf(new Student("haha",18));
        System.out.println(s4);
        System.out.println("-----------------------");
        int val1 = Integer.parseInt("123");
        int val3 = Integer.valueOf("231");
        System.out.println(val3+1);
        System.out.println(val1+1);//String-->int
        double val2 = Double.parseDouble("12.25");
        System.out.println(val2);

    }
    //                      命令行参数
    public static void main4(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void main3(String[] args) {
        //字符串查找
        String str1 = "abcdef";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);//这个字符串的i下标的值
            System.out.print(ch);
        }
        System.out.println();
        System.out.println(str1.indexOf('c'));//返回第一个相同字符的下标
        System.out.println(str1.indexOf('c',1));//从第n个下标找
        System.out.println(str1.indexOf("ef"));//找字串
        System.out.println(str1.indexOf("ef",2));
        System.out.println("=================================");
        System.out.println(str1.lastIndexOf('c'));//从后往前找第一个
        System.out.println(str1.lastIndexOf('c',5));
        System.out.println(str1.lastIndexOf("ef"));
        System.out.println(str1.lastIndexOf("abc",4));
     }
    public static void main2(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hahahah");
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        //int ret = s1.compareTo(s2);//s1和s2比较
        int ret = s1.compareToIgnoreCase(s2);//忽略大小写比较
        if(ret>0){
            System.out.println("s1>s2");
        }
        else if(ret==0){
            System.out.println("s1==s2");
        }
        else{
            System.out.println("s1<s2");
        }
    }
    public static void main1(String[] args) {
        String str1 = "hello";//字符串常量
        String str2 = new String("abc");
        char[]  chars= {'g','a','o'};//字符数组
        String str3 = new String(chars);//转变为字符串
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
