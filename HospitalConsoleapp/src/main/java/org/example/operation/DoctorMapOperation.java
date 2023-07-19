package org.example.operation;

import org.example.models.Asistant;
import org.example.models.Doctor;
import org.example.models.Patient;
import org.example.service.mapImpl.DoctorMapImpl;

import java.util.HashMap;
import java.util.Scanner;

public class DoctorMapOperation {
    Scanner sc =new Scanner(System.in);
    public static long id=0;
    DoctorMapImpl doctorMap=new DoctorMapImpl();

    public void addDrOperation(){
        System.out.println("Hekimin Adini qeyd edin");
        String name=sc.next();
        System.out.println("Hekimin Soyadini qeyd edin");
        String surName=sc.next();
        System.out.println("Hekimin finkodunu daxil edin");
        String finCode= sc.next();
        System.out.println("Hekimin maasini daxil edin");
        Double salary= sc.nextDouble();
        HashMap<String, Asistant>asistantHashMap=new HashMap<>();
        HashMap<String, Patient>patientHashMap=new HashMap<>();
        Doctor doctor=new Doctor(id++,name,surName,finCode,salary,asistantHashMap,patientHashMap);
        doctorMap.addDoctor(doctor);

    }
    public void getDrByFinCodeOperation(){
        System.out.println("Hekimin finkodunu daxil edin");
        String finCode=sc.next();
        doctorMap.getDoctorByFinCode(finCode);
    }
    public void deleteDrOperation(){
        System.out.println("Hekimin finkodunu daxil edin");
        String finCode= sc.next();
        doctorMap.removeDoctorByFinCode(finCode);

    }
    public void sortedBySalaryOperation(){
        doctorMap.sortBySalary();
    }
}
