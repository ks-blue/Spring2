package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;


@Controller
@RequestMapping("/each")

public class EachController {

    @RequestMapping("")
    public String index(Model model){

        List<String>itemList = new ArrayList<>();
        itemList.add(new Item("えんぴつ",120,"緑"));
        itemList.add(new Item("パソコン",198000,"シルバー"));
        itemList.add(new Item("水筒",2280,"白"));

        model.addAllAttribute("itemList",itemList);

        return "each";
    }

}
