package org.example.service.impl;

import org.example.models.Asistant;
import org.example.models.Doctor;
import org.example.service.inter.AsistantInter;
import org.example.service.mapImpl.DoctorMapImpl;

import java.util.*;
import java.util.function.Consumer;

import static org.example.service.impl.DoctorImpl.doctors;

public class AsistantImpl implements AsistantInter {
    @Override
    public void addAsistant(Asistant asistant,String finCode) {
        DoctorImpl doctorimpl=new DoctorImpl();
        Doctor doctor=doctorimpl.getDoctorByFinCode(finCode);
      doctor.getAsistant().add(asistant);
       doctorimpl.removeDoctorByFinCode(finCode);
      doctorimpl.addDoctor(doctor);


    }

    @Override
    public Asistant getAsistantByFincode(String drFinCode,String finCode) {
         DoctorImpl doctor=new DoctorImpl();
     Doctor doctor1=doctor.getDoctorByFinCode(drFinCode);
//   Asistant asistant1=new Asistant();
//        for (Asistant asistants: doctor1.getAsistant()) {
//            if (asistants.getFinCode().equals(finCode)){
//               asistant1=asistants;
//            }
//
//        }
        Asistant asistantConsumer=doctor1
                .getAsistant().stream()
                .filter(asistant -> asistant.getFinCode().equals(finCode)).findFirst()
                .orElse(new Asistant(1l,"Numune","Numune","123"));


        return asistantConsumer;

    }

    @Override
    public void sortPrintAsistant() {

//        for (Doctor doctor:doctors) {
//            Collections.sort(doctor.getAsistant(), Comparator.comparing(Asistant::getName));
//
//        }

     // doctors.stream().forEach(doctor -> doctor.getAsistant().
       //       sort(Comparator.comparing(Asistant::getName)));
        doctors.stream().map(doctor -> doctor.getAsistant()).sorted().forEach(System.out::println);
    }
}
