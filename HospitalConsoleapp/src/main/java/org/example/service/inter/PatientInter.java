package org.example.service.inter;

import org.example.models.Patient;

public interface PatientInter {
    void addPatient(Patient patient,String finCode);
    void removePatient(String patientFinCode,String drFinCode);
    Patient getPatientByFinCode(String patientFinCode,String drFincode);


}
