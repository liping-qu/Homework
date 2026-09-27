package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    @RequestMapping("/hello")
    public String helloSpring(){
        System.out.println("helloSpring");
        return "success";
    }
}
