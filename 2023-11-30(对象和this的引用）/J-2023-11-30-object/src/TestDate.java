/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-11-30
 * Time: 19:13
 */
//this 当前对象的引用
//this.成员变量
//this.访问成员方法
//this();访问构造方法  没有返回值，方法名和类名是一样的
public class TestDate {
    public int year;
    public int month;
    public int day;
    public void setDate(TestDate this, int y, int m, int d){
        this.year=y;//year=year局部变量优先 根本没赋值
        //this year=year;
        //this month =month;
        //this day=day;
        this.month=m;
        this.day=d;
    }
    public void printDate(){
        System.out.println(this.year+"-"+this.month+"-"+this.day);
    }
    public void func(){
        this.printDate();
    }
    public static void main(String[] args) {
        TestDate testDate1 = new TestDate();
        testDate1.setDate(2023,11,30);
        testDate1.printDate();
        System.out.println("fda");
    }
}
