package com.resiqueira.tdd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DiscoveryController {

    @Value("${spring.application.name}")
    private String discovery;

    @Value("${spring.application.name.renato}")
    private String discoveryrenato;

    @GetMapping("/")
    public String beleza(Model model){

        model.addAttribute("appName",  discovery);

        return "home";
    }

    @GetMapping("/renato")
    public String homePageRenato(Model model){

        model.addAttribute("appName",  discoveryrenato);

        return "app";
    }


}
