package ca.gbc.comp3095.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index.html"})
    public String index(){
        return "index.html";
    }



}
