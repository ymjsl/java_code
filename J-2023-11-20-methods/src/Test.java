import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-20
 * Time: 18:56
 */
//看源码  鼠标点到对象 ctrl + 鼠标左键
//判断字符串相等 pass.equals("字符串")
// public static 返回类型 方法名（形式参数）{
//   方法体;
//}
//方法重载 // 通过方法签名来识别相同方法名  // 命令 javap -v
//条件
//1.方法名称一致
//2.方法参数不同【数据类型，个数，顺序】
//3.返回值没有要求
//例
//public static int sum(int a,int b){
//
//         return a+b;
// }
//
//public static int sum(int a,int b,int c){
//
//         return a+b;
// }
//
//public static double sum(double a,double b){
//
//         return a+b;
// }
// 好处 ，不需要记住过多方法名
public class Test {
    public static int add (int a,int b){
        //System.out.println(a+b);
        return a+b;
    }
    public static int facSum(int n){
        int sum =0;
        for (int i = 1; i <=n; i++) {
            sum+=fac(i);
        }
        return sum;
    }
    public static int fac(int n){
        int ret=1;
        for (int j = 1; j<=n; j++) {
            ret*=j;
        }
        return ret;
    }
    public static void swap(int a,int b){
        int tmp =a;
        a=b;
        b=tmp;
    }//errnoeous
    public static void SWAP(int arr[]){
          int tmp = arr[0];
          arr[0] = arr[1];
          arr[1] = tmp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr={a,b};
        System.out.println(arr[0]+" "+arr[1]);
        SWAP(arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void main15(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum1=facSum(num);
        System.out.println(sum1);
    }
    public static void main14(String[] args) {
         int x=1;
         int y=2;
         int sum = add(x,y);
        System.out.println(sum);
    }
    public static void main13(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c =a%b;
        int m= a;
        int n= b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        int x = m*n/b;
        System.out.println(b);
        System.out.println(x);
    }
    public static void main12(String[] args) {
        for (int i = 2; i <100; i++) {
            int j = 0;
            for ( j = 2; j <=Math.sqrt(i); j++) {
                if(i%j==0){
                    break;
                }
            }
            if(j>Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
    public static void main11(String[] args) {
        int n=7;
        for (int i = 31; i >=1 ; i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
    }
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.println("请输入你的密码，还有"+count+"次机会! ");
            String pass = scan.nextLine();
            if(pass.equals("032")){
                System.out.println("登陆成功!");
                break;
            }
            else{
                System.out.println("登录失败!");
            }
            count--;
        }
    }
    public static void main9(String[] args){
        int n = 123;
        while( n!= 0){
            System.out.println(n%10);
            n/=10;
        }
    }
    public static void main8(String[] args){
        //乘法口诀表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+ i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main7(String[] args){
        //打印X图像
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){//判断是不是有下一个整数
            int n = scan.nextInt();//读入一个整数
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if((i == j) || (i+j == n-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main6(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = (int)Math.pow(10,i-1); j <(int)Math.pow(10,i); j++) {
                int sum = 0;
                int tmp = j;
                while(tmp != 0){
                    sum += (int)Math.pow(tmp%10,i);
                    tmp/=10;
                }
                if(sum == j){
                    System.out.println(j);
                }
            }
        }
    }
    public static void main5(String[] args) {
        for (int i = 1; i <= 999999; i++) {
            int sum = 0;
            int count=0;
            int tmp = i;
            while(tmp != 0){
                tmp/=10;
                count++;
            }
            tmp = i;
            while(tmp != 0){
                sum += (int)Math.pow(tmp%10,count);
                tmp/=10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
    public static void main4(String[] args) {
        double sum =0.0;
        int flag=1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i * flag;
            flag=-flag;
        }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        //最终版
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while(num != 0){
            num = num & (num -1);
            count++;
        }
        System.out.println(count);
    }
    public static void main2(String[] args) {
        //二进制有多少个一  改良版
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while(num != 0){
            if((num & 1 ) != 0){
                count++;
            }
            num = num >>> 1;
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        //二进制有多少个一 1.0版
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((num >> i & 1) != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
