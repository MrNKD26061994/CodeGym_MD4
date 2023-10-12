package com.codegym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {
    @GetMapping("/formTranslate")
    public ModelAndView showFormTranslate() {
        return new ModelAndView("translate");
    }

    @PostMapping("/translate")
    public ModelAndView translate(String input) {
        ModelAndView modelAndView = new ModelAndView("translate");
        Map<String, String> translate = new HashMap<>();
        translate.put("hello", "Xin chào");
        translate.put("bye", "Tạm biệt");
        translate.put("hi", "Xin chào");
        modelAndView.addObject("input", input);
        modelAndView.addObject("result", translate.get(input));
        return modelAndView;
    }
}
