package org.example.service.mapImpl;

import org.example.models.Asistant;
import org.example.models.Doctor;
import org.example.service.inter.AsistantInter;

import java.util.HashMap;
import java.util.List;

public class AsistantMapImpl implements AsistantInter {
    @Override
    public void addAsistant(Asistant asistant, String finCode) {
        DoctorMapImpl doctorMap = new DoctorMapImpl();
        Doctor doctor = doctorMap.getDoctorByFinCode(finCode);
        doctor.getAsistant().add(asistant);
        doctorMap.addDoctor(doctor);
    }

    @Override
    public Asistant getAsistantByFincode(String drFinCode, String finCode) {
        DoctorMapImpl doctorMap = new DoctorMapImpl();
        Doctor doctor = doctorMap.getDoctorByFinCode(drFinCode);
        Asistant asistant1 = new Asistant();
        for (Asistant asistant2 :doctor.getAsistant()) {
            if (asistant2.getFinCode().equals(finCode)) {
                asistant1 = asistant2;

            }


        }
        System.out.println(asistant1);
        return asistant1;
    }

    @Override
    public void sortPrintAsistant() {
        List<Asistant>list ;
        Doctor doctor=new Doctor();

         list= doctor.getAsistant();
        for (Asistant asistant:list) {
            System.out.println(asistant);

        }
    }
}

