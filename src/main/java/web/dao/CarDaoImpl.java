package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO{
    public List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> returnCarList(int number) {
        carList.add(new Car("Opel", 2, "Black"));
        carList.add(new Car("BMW", 3, "Yellow"));
        carList.add(new Car("Skoda", 7, "Red"));
        carList.add(new Car("Shevrolet", 5, "White"));
        carList.add(new Car("Mercedes", 4, "Green"));

        if (number >= 5) {
            number = 5;
        }
        return carList.subList(0, number);
    }
}
