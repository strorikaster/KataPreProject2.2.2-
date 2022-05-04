package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;
import java.util.List;

@Service
public class CarSeviceImpl implements CarService{

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> returnNeededCarNumber(int number) {
        return carDAO.returnCarList(number);
    }
}
