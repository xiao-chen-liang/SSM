package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRequestMappingController {
    @RequestMapping("/")
    public String portal() {
        return "index";
    }

}
