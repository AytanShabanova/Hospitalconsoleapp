package org.example.operation;

import org.example.models.Doctor;
import org.example.models.Patient;
import org.example.service.mapImpl.DoctorMapImpl;
import org.example.service.mapImpl.PatientMapImpl;

import java.util.Scanner;

public class PatientMapOperation {
    PatientMapImpl patientMap=new PatientMapImpl();
    public static long id=0;
    Scanner sc=new Scanner(System.in);
    public void addPatientOperation(){
        System.out.println("Xestenin adini qeyd edin");
        String name=sc.next();
        System.out.println("Xestenin soyadini daxil edin");
        String surName= sc.next();
        System.out.println("Xestenin finkodunu daxil edin");
        String finCode= sc.next();
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode= sc.next();
        Patient patient=new Patient(id++,name,surName,finCode);
       patientMap.addPatient(patient,drFinCode);
    }
    public void deletePatientOperation(){
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode= sc.next();
        System.out.println("Xestenin finkodunu daxil edin");
        String finCode= sc.next();
        patientMap.removePatient(finCode,drFinCode);
    }
    public void getPatientOperation(){
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode= sc.next();
        System.out.println("Xestenin finkodunu daxil edin");
        String finCode= sc.next();
        patientMap.getPatientByFinCode(finCode,drFinCode);
    }


}