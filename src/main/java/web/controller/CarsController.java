package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer count,
                               Model model) {
        List<Car> cars = count == null ? carService.getAllCars() : carService.getFirstCars(count);
        List<String> carList = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            carList.add(String.format("%d. %s %s, %4$tb %4$tY",
                    i + 1,
                    car.getMake(),
                    car.getModel(),
                    car.getReleaseDate()));
        }
        model.addAttribute("carList", carList);
        return "cars";
    }

}