package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;



@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String showNumberOfCars (Integer num, Model model) {

        model.addAttribute("num", num);
        model.addAttribute("cars", carService.getCars(num));

        return "cars.html";
    }

}
