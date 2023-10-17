package com.codegym.springcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/caculator")
public class CaculatorController {
    @GetMapping()
    public ModelAndView home(){
        return new ModelAndView("index");
    }
    @PostMapping("/calculate")
    public ModelAndView calculate(@RequestParam("n1") int n1, @RequestParam("n2") int n2, @RequestParam("operator") String operator){
        ModelAndView modelAndView = new ModelAndView("index");
        double restule = 0;
        if(operator.equals("Add")) {
            restule = n1 + n2;
        } else if(operator.equals("Sub")) {
            restule = n1 - n2;
        } else if(operator.equals("Mul")) {
            restule = n1 * n2;
        } else if(operator.equals("Div")) {
            restule = (double) n1 / n2;
        }
        modelAndView.addObject("restule", restule);
        return modelAndView;
    }
}
