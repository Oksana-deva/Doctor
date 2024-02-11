package org.example.personal;

import java.util.Map;
import java.util.Random;

import Illness;

public class Doctor extends Personal {


    public Doctor(String name, int birthYear) {
        super();
    }

    private final Map<Integer, String> diagnoses = Map.of(1, "Лишай", 2, "Чумка", 3, "простуда");

    public void doDiagnose(Animal patient) {
        Random r = new Random();
        int random = r.nextInt(diagnoses.size()) + 1;
        String d = diagnoses.get(random);
        patient.setIllness(new Illness());
        System.out.println("Поставлен диагноз: " + d);;
    }
}