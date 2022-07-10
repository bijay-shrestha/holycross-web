package edu.miu.holycrossweb.service;

import edu.miu.holycrossweb.exception.PatientDataNotFoundException;
import edu.miu.holycrossweb.model.Patient;

import java.util.List;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
public interface PatientService {
    List<Patient> getAllPatients() throws PatientDataNotFoundException;

    void saveAllPatients(List<Patient> patients);
}
