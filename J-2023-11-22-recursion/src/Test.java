import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-22
 * Time: 19:25
 */
//循环(迭代）
public class Test {
    //a 起始位置
    //b 中转位置
    //c 目标位置
    public static void hanoi(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a+"-->"+c);
            return;
        }
        else{
            hanoi(n-1,a,c,b);
            System.out.println(a+"-->"+c);
            hanoi(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        hanoi(n,'a','b','c');
    }
    public static int fib(int n){
        if(n>2) {
            return fib(n-1)+fib(n-2);
        }
        else{
            return 1;
        }
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int n=1;
        while(fib(n)<sum){
            n++;
        }
        System.out.println(n);
    }
    public static int print(int n){
        if(n!=0){
            return print(n/10)+n%10;
        }
        else{
            return 0;
        }
    }
    /*public static void print(int n){
        if(n>10){
            print(n/10);
            System.out.println(n%10);
        }
        else{
            System.out.println(n);
        }
    }*/
    public static void main3(String[] args) {
        int num =1234;
        int sum=print(num);
        System.out.println(sum);
    }
    public static int function(int n){
        if(n>1){
            return n*function(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main2(String[] args) {
        int n =5;
        int sum = function(n);
        System.out.println(sum);
    }
    public static int fib1(int n){
        int f1=1;
        int f2=1;
        int f3=0;
        if(n>=3){
            for(int i= 3; i<=n;i++){
                f3=f1+f2;
                f1=f2;
                f2=f3;
            }
        }
        else{
            f3 = 1;
        }
        return f3;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fibn = fib(n);
        System.out.println(fibn);
    }
}
