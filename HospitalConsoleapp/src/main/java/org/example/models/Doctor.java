package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.ConstructorParameters;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
@Data
public class Doctor implements Comparable<Doctor> {
    Long id;
    String name;
    String surName;

    String finCode;
    Double salary;
    List<Patient>patients;
    List<Asistant>asistant;

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


   @Override
   public int compareTo(Doctor o) {
       return this.salary.compareTo(o.getSalary());
   }



}
