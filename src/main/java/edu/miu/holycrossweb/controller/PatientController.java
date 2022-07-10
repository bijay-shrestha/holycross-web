package edu.miu.holycrossweb.controller;

import edu.miu.holycrossweb.exception.PatientDataNotFoundException;
import edu.miu.holycrossweb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static edu.miu.holycrossweb.constant.WebResourceKeyConstant.*;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Controller
@RequestMapping(value = PATIENT_MVC_BASE)
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(value = PATIENT_LIST)
    public ModelAndView listPatients() throws PatientDataNotFoundException {
        var patients = patientService.getAllPatients();
        var modelAndView = new ModelAndView();
        modelAndView.addObject(PATIENTS_ATTRIBUTE, patients);
        modelAndView.setViewName(PATIENT_LIST_VIEW);
        return modelAndView;
    }
}
