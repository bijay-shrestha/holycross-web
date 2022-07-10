package edu.miu.holycrossweb.service.impl;

import edu.miu.holycrossweb.exception.PatientDataNotFoundException;
import edu.miu.holycrossweb.model.Patient;
import edu.miu.holycrossweb.repository.PatientRepository;
import edu.miu.holycrossweb.service.PatientService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static edu.miu.holycrossweb.constant.ExceptionMessageConstant.PATIENT_DATA_NOT_FOUND;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() throws PatientDataNotFoundException {
        return Optional.of(patientRepository.findAll(Sort.by("fullNames"))).orElseThrow(() ->
                new PatientDataNotFoundException(PATIENT_DATA_NOT_FOUND));
    }

    @Override
    public void saveAllPatients(List<Patient> patients) {
        patientRepository.saveAll(patients);
    }
}
