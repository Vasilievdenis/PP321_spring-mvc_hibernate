package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServicelmp implements CarService {
    private final CarDao carDao;


    @Autowired
    public CarServicelmp(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCar(int count) {

        return carDao.getCar(count);
    }
}
