package com.example.demo.controller;

import com.example.demo.domain.Hoge;
import com.example.demo.domain.HogeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HogeController {

    @Autowired
    HogeMapper hogeMapper;

    @RequestMapping("/top")
    public String topView(){
        return "maimai/top";
    }

    @RequestMapping(value = "/complete", method = RequestMethod.POST)
    public ModelAndView completeView(@ModelAttribute Hoge hoge, Model model) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("maimai/complete");
        hogeMapper.insertHoge(hoge);

        return mav;
    }

}
