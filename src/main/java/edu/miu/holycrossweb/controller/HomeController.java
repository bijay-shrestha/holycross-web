package edu.miu.holycrossweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home", "/holycross/home"})
    public String displayHomePage(){
        return "public/index";
    }

    @GetMapping(value = {"/about", "/holycross/about"})
    public String displayAboutPage(){
        return "public/about";
    }
}
