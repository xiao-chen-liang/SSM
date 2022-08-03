package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/",
        params = ("!hello"))
    public String portal(){
        System.out.println("Welcome to " + this.getClass().getName() + "!");
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping(value = "/",
        params = {"hello","world"})
    public String hello(){
        return "success";
    }
}
