package edu.miu.holycrossweb.repository;

import edu.miu.holycrossweb.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
