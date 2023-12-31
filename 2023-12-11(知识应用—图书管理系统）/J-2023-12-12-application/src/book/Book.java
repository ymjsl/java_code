package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:27
 */
public class Book {
    //private 体现封装性
    private String name;//书名
    private String author;//作者
    private int price;//价格
    private String type;//类型
    private boolean ifBorrowed;//默认false
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public boolean isIfBorrowed() {
        return ifBorrowed;
    }
    public void setIfBorrowed(boolean ifBorrowed) {
        this.ifBorrowed = ifBorrowed;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((ifBorrowed == true)?"已借出":"未借出")+
                ", ifBorrowed=" + ifBorrowed +
                '}';
    }
}
