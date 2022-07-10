package edu.miu.holycrossweb.controller;

import edu.miu.holycrossweb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Controller
@RequestMapping(value = "/holycross/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/list")
    public ModelAndView listPatients() {
        var patients = patientService.getAllPatients();
        var modelAndView = new ModelAndView();
        modelAndView.addObject("patients", patients);
        modelAndView.setViewName("secured/patients/list");
        return modelAndView;
    }
}
