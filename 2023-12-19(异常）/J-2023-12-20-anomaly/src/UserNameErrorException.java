/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: admin
 * Date: 2023-12-24
 * Time: 20:10
 */
public class UserNameErrorException extends RuntimeException{
    public UserNameErrorException(){
        super();
    }
    public UserNameErrorException(String message){
        super(message);
    }
}
