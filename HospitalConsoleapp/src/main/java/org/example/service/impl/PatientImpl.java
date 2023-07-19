package org.example.service.impl;

import org.example.models.Doctor;
import org.example.models.Patient;
import org.example.service.inter.PatientInter;

import java.util.List;

public class PatientImpl implements PatientInter {

    @Override
    public void addPatient(Patient patient, String finCode) {
      DoctorImpl doctorImpl=new DoctorImpl();
     Doctor doctor= doctorImpl.getDoctorByFinCode(finCode);
     DoctorImpl.doctors.remove(doctor);
     if (doctor.getFinCode().equals(finCode)){
         doctor.getPatients().add(patient);

         DoctorImpl.doctors.add(doctor);
     }

    }

    @Override
    public void removePatient(String patientFinCode,String drFinCode) {
      DoctorImpl doctors=new DoctorImpl();
     Doctor doctor= doctors.getDoctorByFinCode(drFinCode);
      if (doctor!=null){
      Patient patient =getPatientByFinCode(patientFinCode,drFinCode);
         doctor.getPatients().remove(patient);
      }


    }

    @Override
    public Patient getPatientByFinCode(String patientFinCode, String drFincode) {
        DoctorImpl doctor=new DoctorImpl();
      Doctor doctor1=  doctor.getDoctorByFinCode(drFincode);
//         List <Patient>patientList=doctor1.getPatients();
//        for (Patient patient:patientList) {
//           if (patient.getFinCode().equals(patientFinCode)){
//               return patient;
//           }
//
//
//
//        }
        Patient patient1= doctor1.getPatients().stream()
                    .filter(patient -> patient.getFinCode().equals(patientFinCode)).findFirst().get();

        return patient1;
    }
}
