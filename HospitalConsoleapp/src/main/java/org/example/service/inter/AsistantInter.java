package org.example.service.inter;

import org.example.models.Asistant;

public interface AsistantInter {
    void addAsistant(Asistant asistant,String finCode);
    Asistant getAsistantByFincode(String drFinCode,String finCode);
    void sortPrintAsistant();
}
