import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-11
 * Time: 11:08
 */
//equals
//引用变量存储的地址是否一致
//比较对象中内容是否相同时，一定要重写equals
class Person{
     private String name;
     private int age;
     public Person(String name,int age){
         this.age=age;
         this.name=name;
     }
     @Override
    public boolean equals(Object object){
         if(object==null){
             return false;
         }
         if(this==object){
             return true;
         }
         //不是Person类对象 ，是不是同种类型
         if(!(object instanceof Person)){
             return false;
         }
         Person person = (Person)object;
         if(this.name.equals(person.name)&&this.age==person.age){
             return true;
         }
         return false;
     }
     @Override
    public int hashCode(){
         //计算对象的位置
         return Objects.hash(name,age);
     }
}
class Student{

}
public class Test3 {
    public static void main(String[] args) {
         Person person1= new Person("zhangsan",18);
         Person person2= new Person("zhangsan",18);
         System.out.println(person1.equals(person2));
    }
}
