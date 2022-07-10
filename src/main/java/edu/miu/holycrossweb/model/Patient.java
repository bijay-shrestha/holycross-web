package edu.miu.holycrossweb.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patients")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @NotNull
    @NotBlank(message = "Patient number cannot be blank.")
    @NotEmpty(message = "Patient number cannot be empty")
    @Column(nullable = false)
    private String patientNumber;
    @NotNull
    @NotBlank(message = "Full names cannot be blank.")
    @NotEmpty(message = "Full names cannot be empty")
    @Column(nullable = false)
    private String fullNames;
    @Column(nullable = false)
    private String emailAddress;
    @Column(nullable = true)
    private String contactPhoneNumber;
    @NotNull

    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @NotNull
    @NotBlank(message = "Is An Out Patient status cannot be blank.")
    @NotEmpty(message = "Is An Out Patient status cannot be empty")
    @Column(nullable = false)
    private String isAnOutPatient;

    public Patient(String patientNumber, String fullNames,
                   String emailAddress, String contactPhoneNumber,
                   LocalDate dateOfBirth, String isAnOutPatient) {
        this.patientNumber = patientNumber;
        this.fullNames = fullNames;
        this.emailAddress = emailAddress;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.isAnOutPatient = isAnOutPatient;
    }
}
