package repositories;

import model.Car;
import java.util.List;

public interface ICarRepository {
    List<Car> findAvailableCars();
}
