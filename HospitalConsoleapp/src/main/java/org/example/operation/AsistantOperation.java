package org.example.operation;

import org.example.models.Asistant;
import org.example.models.Doctor;
import org.example.service.impl.AsistantImpl;
import org.example.service.impl.DoctorImpl;

import java.util.Scanner;

public class AsistantOperation {
    static long id=0;
    AsistantImpl asistantoperation=new AsistantImpl();
    public void addAsistantOperation(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Asistantin adini daxil edin");
        String name=scanner.next();
        System.out.println("Asistantin soyadini daxil edin");
        String surName=scanner.next();
        System.out.println("Asistantin finkodunu daxil edin");
        String finCode=scanner.next();
        System.out.println("Hekimin finkodunu daxil edin");
        String doctorFinCode=scanner.next();
        Asistant asistant=new Asistant(id++,name,surName,finCode);
        asistantoperation.addAsistant(asistant,doctorFinCode);
    }
    public void getAsistantOperation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode=sc.next();
        if (DoctorImpl.doctors!=null){
            for (Doctor doctor:DoctorImpl.doctors) {
                if (doctor.getFinCode().equals(drFinCode)){
                    System.out.println(

                    );
                }

            }
        }


    }



}
