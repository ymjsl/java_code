import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-04
 * Time: 18:54
 */
//静态方法不依赖对象，就可以执行
//同一个类里，任何一个方法调用静态变量或者方法，是可以直接调用的，
//所以你不需要通过类名.变量名或者类名.方法名()来访问，直接变量名或者方法名()就可以了
//导类不导包
//在java中，可以将一个类定义在另一个类或者一个方法的内部，为内部类
//实例内部类  静态内部类 局部内部类 匿名内部类

    class Person{
        int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void getAge(){
        if(this.age<0){
            System.out.printf("%d",0);
        }
        else if(this.age>200){
            System.out.printf("%d",200);
        }
        else {
            System.out.printf("%d",this.age);
        }
    }
}
public class Test {
    public static void main2(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int age=scanner.nextInt();
            person.setAge(age);
            person.getAge();
        }
    }
    public void func(){

    }
    public static void main1(String[] args) {
           Test test = new Test();
           test.func();
    }
}
