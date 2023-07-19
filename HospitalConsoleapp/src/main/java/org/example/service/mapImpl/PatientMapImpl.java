package org.example.service.mapImpl;

import org.example.models.Doctor;
import org.example.models.Patient;
import org.example.service.inter.PatientInter;

public class PatientMapImpl implements PatientInter {
    @Override
    public void addPatient(Patient patient, String finCode) {
        DoctorMapImpl doctorMap=new DoctorMapImpl();
       Doctor doctor= doctorMap.getDoctorByFinCode(finCode);
       doctor.getPtHasMap().put(finCode,patient);
       doctorMap.addDoctor(doctor);


    }

    @Override
    public void removePatient(String patientFinCode, String drFinCode) {
        DoctorMapImpl doctorMap=new DoctorMapImpl();
       Doctor doctor= doctorMap.getDoctorByFinCode(drFinCode);
       doctor.getPtHasMap().remove(patientFinCode);
       doctorMap.addDoctor(doctor);

    }

    @Override
    public Patient getPatientByFinCode(String patientFinCode, String drFincode) {
        DoctorMapImpl doctorMap=new DoctorMapImpl();
       Doctor doctor= doctorMap.getDoctorByFinCode(drFincode);
       doctor.getPtHasMap().get(patientFinCode);


        return null;
    }
}
