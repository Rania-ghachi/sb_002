package dz.ibnrochd.master14.controllers;

import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/search")
    public List<Patient> searchPatientsByNames(@RequestParam("nom") String nom){
        return patientService.searchPatientsByNames(nom);
    }
}
