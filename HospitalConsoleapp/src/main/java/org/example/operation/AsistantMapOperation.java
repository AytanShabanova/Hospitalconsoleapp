package org.example.operation;

import org.example.models.Asistant;
import org.example.service.mapImpl.AsistantMapImpl;

import java.util.Scanner;

public class AsistantMapOperation {
    AsistantMapImpl asistantMap=new AsistantMapImpl();
    Scanner sc=new Scanner(System.in);
    public static long id=0;
    public void addAsistantOperation(){
        System.out.println("Asistantin adini daxil edin");
        String name=sc.next();
        System.out.println("Asistentin soyadini daxil edin");
        String surName= sc.next();
        System.out.println("Asistentin finkodunu daxil edin");
        String finCode= sc.next();
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode= sc.next();
        Asistant asistant=new Asistant(id++,name,surName,finCode);
        asistantMap.addAsistant(asistant,drFinCode);

    }
    public void getAsistantByFinCodeOperation(){
        System.out.println("Hekimin finkodunu daxil edin");
        String drFinCode= sc.next();
        System.out.println("Asistantin finkodunu daxil edin");
        String finCode=sc.next();
        asistantMap.getAsistantByFincode(drFinCode,finCode);
    }
    public void sortAsitantOperation(){
        asistantMap.sortPrintAsistant();
    }
}
