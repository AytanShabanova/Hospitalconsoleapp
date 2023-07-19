package org.example.operation;

import org.example.models.Asistant;
import org.example.models.Doctor;
import org.example.models.Patient;
import org.example.service.impl.DoctorImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorOperation {
    static  long id=0;
DoctorImpl doctoroperation=new DoctorImpl();

   public void addDoctorOperation(){

       Scanner sc=new Scanner(System.in);
       System.out.println("Hekimin adini daxil edin");
       String name=sc.next();
       System.out.println("Hekimin soyadini daxil edin");
       String surName=sc.next();
       System.out.println("Hekimin finkodunu daxil edin");
       String finCode=sc.next();
       System.out.println("Hekimin maasini daxil edin");
       Double salary= sc.nextDouble();
       List<Patient>illList=new ArrayList<>();
       List<Asistant>asistantList=new ArrayList<>();
       Doctor doctor=new Doctor(id++,name,surName,finCode,salary,illList,asistantList);
       doctoroperation.addDoctor(doctor);

   }
   public void getDoctorByFincodeOperation(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Hekimin finkodunu daxil edin");
       String fincode= sc.next();
       doctoroperation.getDoctorByFinCode(fincode);
   }
   public void sortedBySalaryOperation(){
        doctoroperation.sortBySalary();
   }
   public void deleteDrOperation(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Hekimin finkodunu daxil edin");
       String finCode=sc.next();
       doctoroperation.removeDoctorByFinCode(finCode);
   }

}
