package operations;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:50
 */
public class DisplayOperation implements IOperations{
    @Override
    public void work(BookList bookList) {
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < bookList.usedSize; i++) {
            Book book = bookList.getpos(i);
            System.out.println(book);
        }
    }
}
