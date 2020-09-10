package com.example.demo.controller;

import com.example.demo.domain.Hoge;
import com.example.demo.domain.HogeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HogeRestController {

    @Autowired
    HogeMapper hogeMapper;

    @RequestMapping("/select")
    public List<Hoge> getAll(){
        return hogeMapper.findAll();
    }

}
