package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "locale", required = false) Optional<String> locale, Model model) {
        locale.ifPresentOrElse(
                st -> model.addAttribute("title", getTitle(st)),
                () -> model.addAttribute("title", getTitle("ru"))
        );
        model.addAttribute("cars", carService.listCars());
        return "cars";
    }

    private String getTitle(String locale) {
        String answer;
        switch (locale) {
            case "en":
                answer = "CARS";
                break;
            case "ru":
                answer = "МАШИНЫ";
                break;
            default:
                answer = "cars";
                break;
        }
        return answer;
    }

}