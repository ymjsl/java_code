package inherit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-05
 * Time: 19:10
 */
//继承
//子类/派生类
//父类/基类/超类
//把属性和方法全部继承
//继承不要超过三层
//this 会优先访问子类
//super只是一个关键字，在代码层面上能够达到易读的作用
//super.data  访问父类的普通成员变量
//super.func() 调用父类的普通成员发法
//super(); 调用父类的构造方法
//静态不能用this 和super
//final还可以修饰方法 密封方法
    class Student{

}
class Teacher{

}
class School{
        private Student student[];
        private Teacher teacher[];
    }
class Animal{
    public String name;
    public int age;
    public void eat(){
        System.out.println("吃");
    }
    public Animal(String name,int age){
        this.age=age;
        this.name=name;
    }
}
//   子类    继承     父类
class Dog extends Animal{
    public boolean silly;
    //super(); 默认加
    public Dog(String name,int age,boolean silly){
        //1.先帮父类初始化
        super(name,age);
        this.silly=silly;
    }
    public void barks(){
        System.out.println(name+"汪汪！");
    }
    public void houseGuard(){
        System.out.println(name+"看家护院");
    }
    @Override
    public String toString() {
        return "Dog{}";
    }
}
class Cat extends Animal{
    public Cat(String name,int age){
    //1.先帮父类初始化
    super(name,age);
}
    public void barks(){
        System.out.println(name+"喵喵！");
    }
    public void CatchRat(){
        System.out.println(name+"抓耗子");
    }
}
class A{
    @Override
    public String toString() {
        return "111";
    }
}
public class sda {
    public static void main(String[] args) {
        Cat cat = new Cat("小苗",5);
    }
    public static void main12(String[] args) {
        A a =new A();
        System.out.println(new A());
    }
    /*public static void main1(String[] args) {
        Dog dog = new Dog();
        dog.name ="小灰";
        dog.age=10;
        dog.barks();
        dog.eat();
    }*/
}
