/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-07
 * Time: 20:52
 */
//接口
//接口是公共的行为规范标准，符合规范标准就可以通用
//使用inteeface 来修饰接口
//接口中的成员方法不能具体实现
//1.抽象方法 public abstract
//2.JDK1.8开始 允许有可以实现的方法，但必须由default修饰
//3.也可以有静态方法
//4.成员变量默认由public static final
//5.成员方法默认 public abstract
//接口不能实例化
//类和接口之间采用implements 来实现多个接口
//
interface ITest{
    int sz=20;
    void func2();
    public static int a =10;
    public abstract void draw();
    default public void func(){

    }
    public static void func3(){
        System.out.println("fasf");
    }
}
class A implements ITest{
    //抽象方法必须重写
    @Override
    public void draw(){
        System.out.println("oooo");
    }
    @Override
    public void func2(){
        System.out.println("fafafafa");
    }
}
public class Test {

}
