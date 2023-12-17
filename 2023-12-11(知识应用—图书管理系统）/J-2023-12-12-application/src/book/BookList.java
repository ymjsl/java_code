package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:33
 */
public class BookList {
    private Book[] books = new Book[10];
    public int usedSize;//书的个数

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public BookList(){
        books[0]=new Book("三国演义","罗贯中",89,"小说");
        books[1]=new Book("西游记","吴承恩",78,"小说");
        books[2]=new Book("红楼梦","曹雪芹",49,"小说");
        this.usedSize = 3;
    }
    public Book getpos(int pos){
        return books[pos];
    }
    public void setBooks(Book book,int pos){
        //存储一本书到指定位置
        books[pos]=book;
    }

    public void getBooks(Book book,int pos) {
        System.out.println(books[pos].toString());
    }
}
