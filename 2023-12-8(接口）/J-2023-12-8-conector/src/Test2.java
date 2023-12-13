import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-10
 * Time: 20:55
 */
//一个类可以实现多个接口，使用implements用逗号隔开，解决多继承的问题
//java 中只能继承一个类但可以实现多个接口
//object类 是所有类的父类，默认继承
interface A1{
    void func();
}
interface B1{
    void func2();
}
class C1 implements A1,B1{
    @Override
    public void  func(){
        System.out.println("hhh");
    }
    @Override
    public void func2(){
        System.out.println("nono");
    }
}
interface Iflying{
    void flying();
}
interface Iswimming{
    void swimming();
}
interface Irunning{
    void running();
}
class Anmail{
    public String name;
    public int age;
    public Anmail(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
class Dog extends Anmail implements Irunning,Iswimming{
    public Dog(String name, int age){
        super(name,age);
    }
    @Override
    public void swimming(){
        System.out.println(name+"游泳");
    }
    @Override
    public void running(){
        System.out.println(name+"奔跑");
    }
    @Override
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
}
class Bird extends Anmail implements Iflying{
    public Bird(String name, int age){
        super(name,age);
    }
    @Override
    public void flying() {
        System.out.println(name + "飞翔");
    }
}
class Duck extends Anmail implements Iflying,Iswimming,Irunning{
    public Duck(String name, int age){
        super(name,age);
    }

    @Override
    public void flying() {
        System.out.println(name+"飞");

    }

    @Override
    public void running() {
        System.out.println(name+"跑");
    }
    @Override
    public void swimming() {
        System.out.println(name+"游");
    }
}
public class Test2 {
    /*public static void walk(Irunning irunning){
        irunning.running();
    }*/
    /*public static void main1(String[] args) {
        walk(new Dog("小王",18));
        walk(new Duck("明胜",18));
        
    }*/
    public static void  func(Object object){
        System.out.println(object);
    }

    public static void main(String[] args) {
        func(new KeyBoard());
        func(new Mouse());
    }
}
