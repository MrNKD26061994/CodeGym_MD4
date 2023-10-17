package com.codegym.springcontroller.controller;

import com.codegym.springcontroller.model.Customer;
import com.codegym.springcontroller.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

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
    @GetMapping()
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

//    @GetMapping("/customer")
//    public String showCustomer(@RequestParam int id, Model model) {
//        Customer customer = customerService.findById(id);
//        model.addAttribute("customer", customer);
//        return "customers/form";
//    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("/register")
    public String showRegister() {
        return "customers/form";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("customers/form");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(Customer customer) throws SQLException {
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        customerService.save(customer);
        return modelAndView;
    }


}
