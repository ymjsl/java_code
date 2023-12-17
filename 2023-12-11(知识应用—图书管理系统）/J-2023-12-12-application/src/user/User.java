package user;

import book.BookList;
import operations.IOperations;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-12
 * Time: 19:22
 */
public abstract class User {
    protected String name;
    protected IOperations[] iOperations;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }
}
