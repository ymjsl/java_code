/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-06
 * Time: 19:58
 */
//多态体现：在代码运行时，当传递不同类对象时，会调用对应类中的方法
// 重写（覆盖）
//1.方法名称相同
//2.返回值相同
//3.参数列表相同（数据类型，个数，顺序）
//4.子类访问权限大于等于父类权限
//5.final修饰的方法，叫密封方法，不能重写
// static 也不可重写
//重载
//1.方法名称相同
//2.参数列表不同
//3 与返回值无关
//向上转型
//子类对象给父类
//缺点，不能调用子类的属性
//动态绑定
//编译的时候 还是Animal的eat
//但程序运行时，变成了子类的eat
//当在父类构造方法中调用重写方法 会优先调用子类的
//在构造方法中避免使用实例
class Animal {
      public void eat(){
            System.out.println("chi");
      }
}
class Dog extends Animal{
      public void eat(){
            System.out.println("吃狗粮");
      }
      public void bark(){
            System.out.println("bark");
      }
}
public class Test {
      public static void main(String[] args) {
            Animal animal2 = new Dog();//向下转型
            if(animal2 instanceof Dog){
                  Dog dog =(Dog) animal2;
                  dog.bark();
            }
      }
      public static void main2(String[] args) {
            Dog dog = new Dog();
            Animal animal = dog;
            animal.eat();//动态绑定  吃狗粮
      }
      public static void func(int a){

      }
      public static void func(int a,int b){

      }
      public static void func(){

      }

      public static void main1(String[] args) {
            //根据你传入的参数来确定你调用哪个方法，叫静态绑定
            func();
            func(1);
            func(2,3);
      }
}
