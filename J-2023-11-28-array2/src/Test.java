import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-28
 * Time: 18:58
 */
//
//二维数组
//行不可省 列可省
//没指名列时，行都是null,不能打印
public class Test {
    
    public static void func1(int[] array){
        int i=0;
        int j=array.length-1;
        while(i<j){
            while(i<j&&array[i]%2!=0){
                i++;
            }
            while(i<j&&array[j]%2==0){
                j--;
            }
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
        }
    }
    public static void main11(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        func1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*2;
        }
    }

    public static void main10(String[] args) {
        int[] array={1,2,3,4,5,6};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
    public static void main9(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[10];
        array[1] = new int[5];
        System.out.println(Arrays.deepToString(array));
    }
    public static void main8(String[] args) {
        int[][] arr2= new int[2][3];
        for(int[] array:arr2){
            for(int x: array){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main7(String[] args) {
        int[][] array={{1,2,3},{2,3,4}};
        int[][] arr2= new int[2][3];
        int[][] arr3= new int[][]{{1,2,3},{2,3,4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag=false;
            for (int j =0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void main6(String[] args) {
        int[] arr={1,3,5,234,56,34,3,7,95,44,65,99};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main5(String[] args) {
        int[] array= new int[10];
        int[] array2=new int[10];
        Arrays.fill(array,-1);//初始化为-1
        Arrays.fill(array2,2,5,-1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void main4(String[] args) {
        int[] arr={1,3,5,234,56,34,3,7,95,44,65,99};
        int[] arr2={1,3,5,234,56,34,3,7,95,44,65,99};
        boolean flag = Arrays.equals(arr,arr2);
        System.out.println(flag);
    }
    public static void reverse(int[] array){
        //逆置
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main3(String[] args) {
        int[] arr={1,3,5,234,56,34,3,7,95,44,65,99};
        Arrays.sort(arr);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int binarySearch(int[] array,int key){
        //二分查找
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid = (left+right)>>>1;
            if(array[mid]<key){
                left=mid+1;
            }
            else if(array[mid]>key){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main2(String[] args) {
        int[] arr={1,3,5,234,56,34,3,7,95,44,65,99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr,56);
        int index2= Arrays.binarySearch(arr,44);
        System.out.println(index);
        System.out.println(index2);
    }
    public static double avg(int[] array){
        int sum=0;
        for(int x:array){
            sum+=x;
        }
        return sum*1.0/array.length;
    }
    public static int find(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main1(String[] args) {
         int[] arr1={1,3,4,6,23,535,23};
         int[] arr2= Arrays.copyOfRange(arr1,2,5);//[2,5)
        System.out.println(Arrays.toString(arr2));
        int[] arr3=arr2.clone();
    }
}
