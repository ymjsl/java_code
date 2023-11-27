
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-26
 * Time: 18:49
 */
//java数组不存在越界
//会直接报错
// 算数组长度 数组名.length
// java 中有一个专门用来操作数组的工具 Arrays
// Array.toString(数组名) 把数组转换成字符串并返回
// ctrl + 鼠标左键 看源代码
// 数组是一种引用 数组类型
//JVM 方法区  本地方法栈 (重要）java虚拟机栈 （重要） 堆 程序计数器
// 甲骨文 oracle
//native 修饰的方法底层是由c/c++代码实现的

public class Test {
    public static void main(String[] args) {
        int[] arr1={2,5,7,4,3,7,2,12,23,87};
        int[] copy=new int[arr1.length];
        //                        开始位置          目的位置
        System.arraycopy(arr1,0,copy,0,arr1.length);
        System.out.println(Arrays.toString(copy));
    }
    public static void main15(String[] args) {
        int[] arr1={2,5,7,4,3,7,2,12,23,87};
        int[] arr3= Arrays.copyOf(arr1,arr1.length*2);//拷贝
        System.out.println(Arrays.toString(arr3));
    }
    public static void main14(String[] args) {
        int[] arr ={1,3,5,7,9};
        int[] arr2= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static String myToString(int[] tmp){
        //转字符串
        String ret="[";
        if(tmp==null){
            return "null";
        }
        for (int i = 0; i < tmp.length; i++) {
            ret+=tmp[i];
             if(i!=tmp.length-1) {
                 ret += ", ";
             }
        }
        ret+=']';
        return ret;
    }
    public static void main13(String[] args) {
        int[] arr ={1,2,3,4};
        String ret = myToString(arr);
        System.out.println(ret);
    }
    public static void main12(String[] args) {
        //数组转字符串
        int[] arr ={1,2,3,4};
        String ret = Arrays.toString(arr);
        System.out.println(ret);
    }
    public static void fuc5(int[] tmp){
        tmp = new int[]{2,3,4,5};
    }
    public static void main11(String[] args) {
         int[] arr1;
         arr1 = new int[]{1,2,3,4};//整体初始化只有一次机会
    }
    public static void swap(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int tmp=arr[0];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }
    }
    public static void main10(String[] args) {
        int[] arr={1,2,3,4};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] fuc3(){
        int[] tmp={1,2,3,4,5,6,7};
        return tmp;
    }
    public static void main9(String[] args) {
        int[] arr=fuc3();
        System.out.println(Arrays.toString(arr));
    }
    public static void fuc1(int[] arr){
        arr = new int[10];
    }
    public static void fuc2(int[] arr){
        arr[0] = 99;
    }
    public static void main8(String[] args) {
        int[] arr = {1,2,3,4};
        fuc1(arr);
        //fuc2(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main7(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={4,5,6,7,8};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] arr3=null;//代表不指向任何对象 null!=0
        System.out.println(arr3);
    }
    public static void main6(String[] args) {
        int[] arr1={1,2,3,4};
        System.out.println(Arrays.toString(arr1));
        int[] arr2=arr1;
        arr2[1]=99;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void main5(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(arr);//[I@1b6d3586
        //简单认为是地址
        //是由哈希得到的
    }
    public static void main4(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr1 = {1,2,3};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        // 数组当中数据的类型定义的变量 ：数组名  for each 增强for循环
        for(int x : arr1){
            System.out.print(x+" ");//无数组下标
        }
        System.out.println();
        String ret = Arrays.toString(arr1);
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        int[] arr1 = {1,2,3};//直接赋值 静态初始化
        int[] arr2 = new int[]{1,2,3,4};//动态初始化
        //没有本质区别
        int[] arr3 = new int[10];//默认全为0；
        int[] arr4;
        arr4 = new int[]{1,2,3};
        boolean[] arr5 = new boolean[10];//默认false
    }
    public static void main1(String[] args) {
        /*int a1=1;
        int a2=2;
        int a3=3;*/
        int[] arr={1,2,3};
        float[] arr2={1.0f,2.5f};
        System.out.println(arr[1]);
        int len = arr.length;
        System.out.println(len);
    }
}
