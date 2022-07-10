package edu.miu.holycrossweb.advice;

import edu.miu.holycrossweb.exception.PatientDataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bijayshrestha on 7/9/22
 * @project holycross-web
 */
@RestControllerAdvice
public class HolyCrossExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PatientDataNotFoundException.class)
    public Map<String, String> handleWebAPIException(PatientDataNotFoundException patientDataNotFoundException){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", patientDataNotFoundException.getMessage());
        return errorMap;
    }
}
