/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-29
 * Time: 18:59
 */
//n^n=0
//n^0=0
//相同为0 相异为一
//类
//java 里一切皆对象  OOP 面向对象编程语言 封装 继承 多态
//通过类去描述一个具体对象
//类名 大驼峰
//方法名/变量名 小驼峰
class Dog{
    public String name;
    public String color;
    public void barks(){
        System.out.println("汪汪!");
    }
    public void wag(){
        System.out.println("摇尾巴");
    }
}
class WashMachine{
    //属性-->成员属性
    //行为-->成员方法
    public  String brand;
    public String type;
    public double weight;
    public double width;
    public void dryClothes(){
        System.out.println("脱水功能");
    }
    public void washClothes(){
        System.out.println("洗衣功能");
    }
    public void setTime(){
        System.out.println("定时功能");
    }
}
class Person{
    public int age;
    public String name;
    public void eat(){
        System.out.println("吃饭! ");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.name = "来福";
        dog.color = "黑色";
        System.out.println(dog.color);
        System.out.println(dog.name);
        dog.barks();
        dog.wag();
    }
    public static boolean func4(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                count++;
                if(count==3){
                    return true;
                }
            }
            else{
                count = 0;
            }
        }
        return false;
    }
    public static int majorityElement(int[] nums){
        //投票法
        int count=0;
        int ret=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==ret){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ret=nums[i+1];
            }
        }
        return ret;
    }
    public static int func2(int[] array){
        int ret=array[0];
        for (int i = 1; i < array.length; i++) {
            ret^=array[i];
        }
        return ret;
    }
    public static int[] func1(int[] array,int target){
        int[] ret = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    ret[0]=i;
                    ret[1]=j;
                }
            }
        }
        return ret;
    }
}
