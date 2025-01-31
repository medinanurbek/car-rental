package interfaces;

import model.Car;
import java.util.List;

public interface ICarController {
    List<Car> getAvailableCars();
    void rentCar(int carId, int userId);
}
