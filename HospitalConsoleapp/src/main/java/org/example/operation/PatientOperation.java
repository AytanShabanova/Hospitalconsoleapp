package org.example.operation;

import org.example.models.Patient;
import org.example.service.impl.DoctorImpl;
import org.example.service.impl.PatientImpl;

import java.util.Scanner;

public class PatientOperation {
    long id=0;
    PatientImpl patientOparetion=new PatientImpl();
    Scanner sc=new Scanner(System.in);
    public void addPatient(){
        System.out.println("Patientin adini daxil edin");
        String name=sc.next();
        System.out.println("Patientin soyadini daxil edin");
        String surName=sc.next();
        System.out.println("Patientin finkodunu daxil edin");
        String finCode=sc.next();
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode=sc.next();


        Patient patient=new Patient(id++,name,surName,finCode);
        patientOparetion.addPatient(patient,drFinCode);

    }
    public  void deletePatient(){
        System.out.println("Patientin finkodunu daxil edin");
        String finCode=sc.next();
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode=sc.next();
        patientOparetion.removePatient(finCode,drFinCode);
    }
    public void getPatient(){
        System.out.println("Hekimin finkodunu daxil edin");
        String finCode=sc.next();
        System.out.println("Xestenin finkodunu daxil edin");
        String ptFinCode=sc.next();
        patientOparetion.getPatientByFinCode(ptFinCode,finCode);
    }
}
