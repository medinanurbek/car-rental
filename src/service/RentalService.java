package service;

import com.Database.DatabaseConnection;
import com.carrental.interface.RentalServiceInterface;
import java.sql.*;

public class RentalService implements RentalServiceInterface {
    public boolean isCarOccupied(int carId, Date startDate, Date endDate) throws SQLException {
        String query = "SELECT COUNT(*) FROM RentalDays WHERE rental_id IN (SELECT id FROM Rentals WHERE car_id = ?) " +
                "AND rental_date BETWEEN ? AND ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, carId);
            stmt.setDate(2, startDate);
            stmt.setDate(3, endDate);
            ResultSet rs = stmt.executeQuery();
            return rs.next() && rs.getInt(1) > 0;
        }
    }

    public void rentCar(int carId, int userId, Date startDate, Date endDate) throws SQLException {
        // Implement logic here
    }
}
