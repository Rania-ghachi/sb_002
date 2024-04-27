package dz.ibnrochd.master14.services;

import dz.ibnrochd.master14.mappers.PatientMapper;
import dz.ibnrochd.master14.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {

    @Autowired
    private  PatientMapper patientMapper;

    public List<Patient> searchPatientsByNames(String nom){

        return patientMapper.searchPatientsByNames(nom);
    }

}
