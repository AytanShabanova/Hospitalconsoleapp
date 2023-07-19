package org.example.operation;

import java.util.Scanner;

public class MainMapOperation {
    public static void main(String[] args) {
   new MainMapOperation().start();
    }

    public void start() {


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("   Sisteme Hekim kimi daxil Olmaq ucun 1 \n Asistant kimi daxil olmaq ucun 2\n Pasient kimi daxil olmaq ucun 3 \n daxil edin");
            int count = sc.nextInt();
            if (count == 1) {
                DoctorMapOperation doctorMapOperation = new DoctorMapOperation();
                System.out.println("Hekim elave etmek ucun 1\n Hekimi sistemden silmek ucun 2\n Hekimi ekrana getirmek ucun 3\n Hekimlerin maasini gormek ucun 4 \n daxil edin");
                count = sc.nextInt();
                switch (count) {
                    case 1:
                        doctorMapOperation.addDrOperation();
                        break;
                    case 2:
                        doctorMapOperation.deleteDrOperation();
                        break;
                    case 3:
                        doctorMapOperation.getDrByFinCodeOperation();
                        break;
                    case 4:
                        doctorMapOperation.sortedBySalaryOperation();
                        break;
                    default:
                        System.out.println("Kodu sehf daxil etdiniz");
                }
            } else if (count == 2) {
                AsistantMapOperation asistantMapOp = new AsistantMapOperation();
                System.out.println("  Asistant elave etmekc ucun 1 \n Asistanti ekrana getirmek ucun 2 \n Asistanlari ad siyahisi ile getirmek ucun 3 \n daxil edin");
                count = sc.nextInt();
                switch (count) {
                    case 1:
                        asistantMapOp.addAsistantOperation();
                        break;
                    case 2:
                        asistantMapOp.getAsistantByFinCodeOperation();
                        break;
                    case 3:
                        asistantMapOp.sortAsitantOperation();
                        break;
                    default:
                        System.out.println("Kodu sehf daxil etdiniz");


                }


            } else if (count == 3) {
                PatientMapOperation patientMapOp = new PatientMapOperation();
                System.out.println("  Xeste qeydiyyati ucun 1 \n Xesteni qeydiyyatdan silinmesi ucun 2 \n Xesteni bilgilerini ekrana getirmek ucun 3 \n  daxil edin");
                count = sc.nextInt();
                switch (count) {
                    case 1:
                        patientMapOp.addPatientOperation();
                        break;
                    case 2:
                        patientMapOp.deletePatientOperation();
                        break;
                    case 3:
                        patientMapOp.getPatientOperation();
                        break;
                    default:
                        System.out.println("Yanlis kod daxil etdiniz");
                }
            }

        }
    }
}
