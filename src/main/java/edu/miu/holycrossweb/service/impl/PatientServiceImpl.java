package edu.miu.holycrossweb.service.impl;

import edu.miu.holycrossweb.model.Patient;
import edu.miu.holycrossweb.repository.PatientRepository;
import edu.miu.holycrossweb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll(Sort.by("fullNames"));
    }

    @Override
    public void saveAllPatients(List<Patient> patients) {
        patientRepository.saveAll(patients);
    }
}
