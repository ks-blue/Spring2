package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex-16")

public class Ex16Controller {
    @RequestMapping("")
    public String index(){

        
        return "ex-16";
    }

}
