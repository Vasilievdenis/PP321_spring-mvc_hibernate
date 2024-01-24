package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarDaolmp implements CarDao {
    private final List<Car> carList = new ArrayList<>();

    {

        carList.add(new Car("Audi", "black", 295));
        carList.add(new Car("BMW", "white", 285));
        carList.add(new Car("Toyota", "red", 290));
        carList.add(new Car("Vaz", "blue", 180));
        carList.add(new Car("Chevrolet", "grey", 260));
    }

    @Override
    public List<Car> getCar(int count) {
        return carList.stream().limit(count).toList();
    }
}
