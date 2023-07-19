package org.example.service.mapImpl;

import org.example.models.Doctor;
import org.example.service.inter.DoctorInter;

import java.util.HashMap;

public class DoctorMapImpl implements DoctorInter {
    public static HashMap<String,Doctor>drHashMap=new HashMap<>();
    @Override
    public void addDoctor(Doctor doctor) {
        drHashMap.putIfAbsent(doctor.getFinCode(), doctor);
    }

    @Override
    public Doctor getDoctorByFinCode(String finCode) {
        Doctor dr=new Doctor();
        for (Doctor doctor: drHashMap.values()) {
            if (doctor.getFinCode().equals(finCode)){
                dr=doctor;

            }

        }
        System.out.println(dr);
        return dr ;
    }

    @Override
    public void sortBySalary() {
        System.out.println(drHashMap.values());

    }

    @Override
    public void removeDoctorByFinCode(String finCode) {
       drHashMap.remove(finCode);

    }
}
