package demo1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-11
 * Time: 11:35
 */
//总结 如果以后自定义的类型要比较大小，必须要让这个类具备可比较的功能
//选择实现接口Comparable<对应类型>
class Student implements Comparable<Student> {
    //                                泛型
    public String name;
    public int age;
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\''+
                ", age" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //根据年龄排序
        if(this.age-o.age>0){
            return 1;
        }
        else if(this.age-o.age<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test4 {
    public static void bubbleSort(Comparable[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    Comparable tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]= new Student("bit",10);
        students[1]= new Student("hehe",40);
        students[2]= new Student("abc",5);
        bubbleSort(students);
        System.out.println(Arrays.toString(students));
    }
    public static void main3(String[] args) {
        Student student1= new Student("bit",10);
        Student student2= new Student("hehe",40);
        AgeComparator ageComparator = new AgeComparator();
        if(ageComparator.compare(student1,student2)>0){
            System.out.println("student1>student2");
        }
        else{
            System.out.println("student1<student2");
        }
    }
    public static void main2(String[] args) {
         Student[] students = new Student[3];
        students[0]= new Student("bit",10);
        students[1]= new Student("hehe",40);
        students[2]= new Student("abc",5);
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(students,ageComparator);//重点
        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        int[] array ={1,4,2,7,3,8,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
