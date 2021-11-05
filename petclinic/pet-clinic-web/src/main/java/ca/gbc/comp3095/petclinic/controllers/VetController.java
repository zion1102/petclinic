package ca.gbc.comp3095.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/vets")
@Controller
public class VetController {
    @RequestMapping({"","/","/index","/index.html"})
    public  String listVets(){
        return "vets/index";
    }
}
