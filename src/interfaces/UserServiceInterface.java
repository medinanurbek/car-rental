package interfaces;

import java.sql.SQLException;

public interface UserServiceInterface {
    boolean userExists(int userId) throws SQLException;
    void addNewUser(int userId) throws SQLException;
}
