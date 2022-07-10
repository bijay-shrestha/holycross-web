package edu.miu.holycrossweb;

import edu.miu.holycrossweb.model.Patient;
import edu.miu.holycrossweb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class HolycrossWebApplication implements CommandLineRunner {

    @Autowired
    private PatientService patientService;

    public static void main(String[] args) {
        SpringApplication.run(HolycrossWebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient p1 = new Patient(
                "P1000001",
                "John H. Smith",
                "jhsmith@globalmail.net",
                "(641) 001-0012",
                LocalDate.of(1959,5,21),
                "Yes");
        Patient p2 = new Patient(
                "EP1000002",
                "Ann-Marie Washington",
                "awashington@hcmc.org",
                "(641) 002-0034",
                LocalDate.of(1949,12,3),
                "Yes");
        Patient p3 = new Patient(
                "EP1000003",
                "Diego A. Ortiz ",
                "diego@gmail.com",
                "(641) 004-0015",
                LocalDate.of(1979,11,14),
                "No");

        patientService.saveAllPatients(List.of(p1, p2, p3));
    }
}
