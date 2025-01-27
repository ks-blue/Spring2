package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Car;

@Controller
@RequestMapping("/if-unless")

public class IfUnlessController {

    @RequestMapping("")
    public String index(Model model){
        Car car =new Car();
        car.setSpeed(60);


    model.addAllAttribute("car",car);

    return "if-unless";

    }

}
