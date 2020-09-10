package com.example.demo.controller;

import com.example.demo.domain.Hoge;
import com.example.demo.domain.HogeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HogeController {

    @Autowired
    HogeMapper hogeMapper;

    @RequestMapping("/top")
    public ModelAndView topView(@ModelAttribute("hoge") Hoge hoge, ModelAndView mav ) {
        mav.setViewName("maimai/top");
        return mav;
    }

    @RequestMapping(value = "/complete", method = RequestMethod.POST)
    public ModelAndView completeView(@ModelAttribute Hoge hoge, BindingResult result, ModelAndView mav) {
        // ModelAndView mav = new ModelAndView();
        if (result.hasErrors()) {
            // バインドエラー時
            System.out.println("bind error");
            mav.setViewName("error");
            return mav;
        }
        System.out.println("bind success");
        mav.setViewName("maimai/complete");
        hogeMapper.insertHoge(hoge);

        return mav;
    }

}
