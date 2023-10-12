package com.codegym.demo.controller;

import com.codegym.demo.model.Customer;
import com.codegym.demo.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    CustomerService customerService = CustomerService.getInstance();

//    C1
//    @GetMapping("/customers")
//    public String showList(HttpServletRequest request) {
//        List<Customer> customers = customerService.findAll();
//        request.setAttribute("customers", customers);
//        return "customers/list";
//    }

//    C2
//    @GetMapping("/customers")
//    public String showList(Model model) {
//        List<Customer> customers = customerService.findAll();
//        model.addAttribute("customers", customers);
//        return "customers/list";
//    }

//    C3
    @GetMapping("/customers")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customer")
    public String showCustomer(@RequestParam int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customers/form";
    }
}
