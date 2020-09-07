package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HogeController {

    @RequestMapping("/top")
    public String topView(){
        return "maimai/top";
    }

    @RequestMapping("/input1.html")
    public String input1View(){
        return "maimai/input1";
    }

    @RequestMapping("/input2.html")
    public String input2View(){
        return "maimai/top";
    }


}
