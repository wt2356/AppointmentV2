package cdu.jaav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("hello")
    public String hello(){
        return "helloView";
    }
    @GetMapping("getMain")
    public String getMain(){
        return "main";
    }
}
