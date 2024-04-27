//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dz.ibnrochd.master14.mappers;

import dz.ibnrochd.master14.model.Patient;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface PatientMapper {
    List<Patient> searchPatientsByNames(String nom);
}

