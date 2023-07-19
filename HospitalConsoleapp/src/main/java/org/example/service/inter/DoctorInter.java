package org.example.service.inter;

import org.example.models.Doctor;

public interface DoctorInter {
    void addDoctor(Doctor doctor);
    Doctor getDoctorByFinCode(String finCode);
    void sortBySalary();
    void removeDoctorByFinCode(String finCode);

}
