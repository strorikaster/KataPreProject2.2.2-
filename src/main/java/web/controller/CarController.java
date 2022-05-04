package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCar(ModelMap model, @RequestParam (value = "count", defaultValue = "5") String count) {
        List<Car> cars = new ArrayList<>();
        cars.addAll(carService.returnNeededCarNumber(Integer.parseInt(count)));
        model.addAttribute("cars", cars);
        return "cars";
    }

}
