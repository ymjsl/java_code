/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-30
 * Time: 19:46
 */
//当没提供构造方法时 ，系统会默认提供
//当构造方法调用后，对象就产生了
//可以被重载
public class Student {
    public String name;
    public int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*public Student(){
            this("wangwu",99);//必须放在构造方法里，并且第一行
            //调用本类当中其他的构造方法
            System.out.println("不带参数的");
        }*/
    /*public Student(String name,int age){
        //this(); 不能循环调用
        System.out.println("带参数的");
        this.age=age;
        this.name=name;
    }*/
    /*public void setStudent(String name,int age){
        this.age=age;
        this.name=name;
    }*/
    public void print(){
        System.out.println(this.name+"=>"+this.age);
    }
    public static void main(String[] args) {
          //Student student2= new Student();
          Student student1= new Student("haha",18);//会调用构造方法
          //student1.setStudent("杨俊峰",18);
          student1.print();
    }
}
