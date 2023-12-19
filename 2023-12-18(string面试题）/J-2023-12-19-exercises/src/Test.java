import java.util.Locale;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-19
 * Time: 16:54
 */
//StringBuffer 一般多线程
//StringBuilder 一般单线程
public class Test {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                sb.append((char)(ch+32));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public int countSegments(String s) {
        s=s.trim();//去掉左右两边空格
        if(s==null||s.length()==0){
            return 0;
        }
        int count =0;
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length()!=0){
                count++;
            }
        }
        return count;
    }
}
   /* public int firstUniqChar(String s) {
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            array[ch-97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(array[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }*/
   /*public int lengthOfLastWord(String s) {
       String[] str = s.split(" ");
       String ret = str[str.length];
       return ret.length();
   }*/
   /*public int lengthOfLastWord(String s) {
       int index=-1;
       for (int i = s.length()-1; i>=0; i--) {
           if(s.charAt(i)==' '){
               index = i;
               break;
           }
       }
       return s.length()-1-index;
   }*/
   /* public static boolean isEffective(char ch){
        if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'){
            return true;
        }
        return false;
    }
   public static boolean wasPalindrome(String s) {
       s=s.toLowerCase();
       char[] chars = new char[1000];
       int k=0;
       for (int i = 0; i <s.length() ; i++) {
           if(isEffective(s.charAt(i))){
               chars[k]=s.charAt(i);
               k++;
           }
       }
       chars[k]='\0';
       String str = new String(chars);
       int left =0;
       int right=k-1;
       while(left<right){
           if(str.charAt(left)==str.charAt(right)){
               left++;
               right--;
           }
           else{
               return false;
           }
       }
       return true;
   }*/
    /*public static void main1(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.println(wasPalindrome(s));
    }
}*/
