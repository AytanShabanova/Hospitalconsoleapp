package org.example.service.impl;

import org.example.service.inter.DoctorInter;
import org.example.models.Doctor;

import java.util.*;

public class DoctorImpl implements DoctorInter {
    public static List<Doctor>doctors=new ArrayList<>();
    @Override
    public void addDoctor(Doctor doctor) {
          doctors.add(doctor);
        System.out.println(doctor);
        System.out.println("-----");
    }

    @Override
    public Doctor getDoctorByFinCode(String finCode) {
            //Doctor doctor=new Doctor();
//        for (Doctor doctor1:doctors) {
//            if (doctor1.getFinCode().equals(finCode)){
//                doctor=doctor1;
//
//            }
//        }
      Doctor doctor1=  doctors.stream()
              .filter(doctor -> doctor.getFinCode()
                      .equals(finCode)).findFirst().get();

       // System.out.println(doctor);
        return doctor1;
    }

    @Override
    public void sortBySalary() {
        //Collections.sort(doctors, Comparator.comparing(Doctor::getSalary));
      //  Collections.sort(doctors);
//        for (Doctor doctor1:doctors ) {
//            System.out.println(doctor1);
//        }
       // doctors.stream().sorted().forEach(Doctor::getSalary);



    }

    @Override
    public void removeDoctorByFinCode(String finCode) {

        doctors.remove(getDoctorByFinCode(finCode));
    }
}
