package org.example.operation;

import java.util.Scanner;

public class MainOperation {
    public static void main(String[] args) {




    }
    public void start(){
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("   Sisteme Hekim kimi daxil Olmaq ucun 1 \n" +
                " Asistant kimi daxil olmaq ucun 2\n Pasient kimi daxil olmaq ucun 3 \n daxil edin");
        count= sc.nextInt();
        if (count==1){
            DoctorOperation dr=new DoctorOperation();
            System.out.println("Hekim elave etmek ucun 1\n Hekimi sistemden silmek ucun 2\n " +
                    "Hekimi ekrana getirmek ucun 3\n Hekimlerin maasini gormek ucun 4 \n daxil edin");
            count= sc.nextInt();
            switch (count){
                case 1:dr.addDoctorOperation();
                break;
                case 2:dr.deleteDrOperation();
                break;
                case 3:dr.getDoctorByFincodeOperation();
                break;
                case 4:dr.sortedBySalaryOperation();
                break;
                default:
                    System.out.println("Kodu yanlis daxil etdiniz");
            }
        } else if (count==2) {
            AsistantOperation as=new AsistantOperation();
            System.out.println("  Asistant elave etmekc ucun 1 \n Asistanti ekrana getirmek ucun 2 \n daxil edin");
            count= sc.nextInt();
            switch (count){
                case 1:as.addAsistantOperation();
                break;
                case 2:as.getAsistantOperation();
                break;
                default:
                    System.out.println("Yanlis kod daxil etdiniz");
            }


        } else if (count==3) {
            PatientOperation pt=new PatientOperation();
            System.out.println("  Xeste qeydiyyati ucun 1 \n Xesteni qeydiyyatdan silinmesi ucun 2" +
                    " \n Xestenin bilgilerini ekrana getirmek ucun 3 \n  daxil edin");
            count= sc.nextInt();
            switch (count){
                case 1:pt.addPatient();
                break;
                case 2:pt.deletePatient();
                break;
                case 3:pt.getPatient();
                break;
                default:
                    System.out.println("Kodu sehf daxil etdiniz");
            }

        }
    }
}
