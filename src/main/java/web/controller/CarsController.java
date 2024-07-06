package web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Models.service.CarServiceImpl;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    private final CarServiceImpl carService;

    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.getAllCars(count));
        return "cars";
    }
}
