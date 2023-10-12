package com.codegym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyConversionController {
    @GetMapping("/formCurrency")
    public ModelAndView showFormCurrency() {
        return new ModelAndView("formCurrencyConversion");
    }

    @PostMapping("/currency")
    public ModelAndView showCurrency(String input) {
        ModelAndView modelAndView = new ModelAndView("formCurrencyConversion");
        modelAndView.addObject("input", input);
        modelAndView.addObject("result", Integer.parseInt(input) * 24000);
        return modelAndView;
    }
}
