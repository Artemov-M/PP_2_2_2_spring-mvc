package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Make1", "Model1",LocalDate.of(2001, 1, 1)),
            new Car("Make2", "Model2", LocalDate.of(2002, 2, 2)),
            new Car("Make3", "Model3", LocalDate.of(2003, 3, 3)),
            new Car("Make4", "Model4", LocalDate.of(2004, 4, 4)),
            new Car("Make5", "Model5", LocalDate.of(2005, 5, 5))
    ));

    @Override
    public List<Car> getFirstCars(int num) {
        if (num < 0) {
            num = 0;
        } else if ( num > cars.size()) {
            return cars;
        }
        return cars.subList(0, num);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

}
