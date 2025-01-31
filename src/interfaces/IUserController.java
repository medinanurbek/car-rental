package interfaces;
import model.User;

public interface IUserController {
    void createUser(User user);
    boolean userExists(int userId);
}
