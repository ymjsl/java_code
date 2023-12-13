package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-11
 * Time: 20:24
 */
//protected
//不同包中需要super去访问
//clone
//1.首先实现Cloneable接口
//2.重写clone 方法
//3.修改异常 和强转
class Money implements Cloneable{
    public  double m = 12.5;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    //空接口/标记接口 代表当前类可以被克隆
    public int id;
    public Money money = new Money();
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp =(Person) super.clone();
        tmp.money= (Money) this.money.clone();
        return tmp;
    }
}
public class Test5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person :"+person.money.m);
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.id = 999;
        Person person1 =(Person) person.clone();
        System.out.println(person1);
        System.out.println(person);
    }
}
