package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.ConstructorParameters;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
@Data
public class Doctor {
    Long id;
    String name;
    String surName;

    String finCode;
    Double salary;
    List<Patient>patients;
    List<Asistant>asistant;
    HashMap<String,Patient>ptHasMap;
    HashMap<String,Asistant>asHasMap;
    public Doctor(){

    }
    public Doctor(Long id, String name, String surName, String finCode, Double salary,List<Patient>patient,List<Asistant>asistant){
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.finCode=finCode;
        this.salary=salary;
        this.asistant=asistant;
        this.patients=patient;


    }
    public  Doctor(Long id,String name,String surName,String finCode,Double salary,HashMap<String,Asistant>asistantMap,HashMap<String,Patient>patientMap){
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.finCode=finCode;
        this.salary=salary;
        this.asHasMap=asistantMap;
        this.ptHasMap=patientMap;

    }



//    @Override
//    public int compare(Doctor o1, Doctor o2) {
//
//        return o1.salary.intValue()-o2.salary.intValue();
//    }

//    @Override
//    public int compareTo(Doctor o) {
//        return this.salary.compareTo(o.getSalary());
//    }



}
