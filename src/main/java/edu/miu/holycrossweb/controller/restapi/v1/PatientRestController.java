package edu.miu.holycrossweb.controller.restapi.v1;

import edu.miu.holycrossweb.exception.PatientDataNotFoundException;
import edu.miu.holycrossweb.model.Patient;
import edu.miu.holycrossweb.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static edu.miu.holycrossweb.constant.WebResourceKeyConstant.PATIENT_BASE;
import static edu.miu.holycrossweb.constant.WebResourceKeyConstant.PATIENT_LIST;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@RestController
@RequestMapping(PATIENT_BASE)
public class PatientRestController {

    private final PatientService patientService;

    public PatientRestController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(PATIENT_LIST)
    public ResponseEntity<List<Patient>> getAllPatients() throws PatientDataNotFoundException {
        return ResponseEntity.ok(patientService.getAllPatients());
    }
}
