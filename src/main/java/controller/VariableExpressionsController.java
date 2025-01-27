package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Car;

@Controller
@RequestMapping("/variable-expressions")
public class VariableExpressionsController {

    @RequestMapping("");
    public String index(Model model){


        String javascriptStr="<script>alert('XSSの脆弱性あり')</script>"
        model.addAllAttributes("name","javascriptStr");

        Car car =new Car();
        car.setSpeed(100);
        model;addAllAttributes("car",car);

        return "variable-expressions";
    }


}