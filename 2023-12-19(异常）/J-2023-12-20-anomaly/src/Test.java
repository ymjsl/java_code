import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-20
 * Time: 18:43
 */
//异常
//将程序执行中发生的不正常行为称为异常
//编译时异常/受查异常
//运行时异常/非受查异常
//Throwable 是异常体系的顶层类，其派生出两个重要子类Error和Exception
//Error 指java虚拟机无法解决的严重问题，比如jvm的内部错误，资源耗尽等
//Exception 异常产生后程序员可以通过代码进行处理，使程序继续执行
//异常的处理
//1.防御式编程 事情防御型
//2.事后认错型
//不会同时抛出两个异常
//如果异常类之间具备父子类关系
//不要把父类放在前面，而是放在最后面
//finally
//有些特定的代码，不论程序是否发生异常，都需要执行，
// 比如程序中打开的资源，在程序正常或者异常退出时
//必须对资源进行回收。因为异常会引发程序的跳转，可
//能导致有些语句执行不到，用finally来解决
//throw 是手动扔一个异常
//throws是声明这个异常
class Login{
    private String userName = "admin";
    private String password = "123456";
    public void loginInfo (String userName,String password){
        try{
             if(!this.userName.equals(userName)){
                 throw new UserNameErrorException("用户名异常");
                 //System.out.println("用户名错误");
                 //return;
             }
             if(!this.password.equals(password)){
                 //System.out.println("密码错误");
                 //return;
                 throw new PassWordException("密码错误");
             }
             System.out.println("登陆成功");
        }catch (UserNameErrorException e){
            e.printStackTrace();
        }catch (PassWordException e) {
            e.printStackTrace();
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Login login = new Login();
        login.loginInfo("admin1","123456");
    }
    public static void main3(String[]  args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("不匹配");
        }finally {
            //return 100;// 不要在finally中return 数据
            //不管有没有异常都要执行
        }
    }
    public static void test(int a) throws CloneNotSupportedException {
        try {
            if(a==10){
                throw new CloneNotSupportedException();
            }
            System.out.println(1);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println("11111");
    }

    public static void main2(String[] args) throws CloneNotSupportedException {
        test(10);
        System.out.println("2");  
    }
    public static void main1(String[] args) {
        try {
            System.out.println(10/0);
            //        你将要捕捉的异常
        }catch (ArithmeticException e){
            e.printStackTrace();//快速定位异常出现的位置
            System.out.println("出现异常！");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("数组越界");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("空指针u ");
        }
        System.out.println("执行后续代码");
    }
}
