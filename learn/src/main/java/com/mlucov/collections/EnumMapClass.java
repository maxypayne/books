package com.mlucov.collections;

import java.util.EnumMap;
import java.util.Iterator;

public class EnumMapClass {
    public enum ETAT {
        NOUVEAU, EN_COURS, EN_PAUSE, INDETERMINE, TERMINE;
    }
    EnumMap<ETAT, String> enumMap = new EnumMap<>(ETAT.class);

    public void main(String[] args) {
        enumMap.put(ETAT.NOUVEAU, "Nouvelle tache");
        enumMap.put(ETAT.EN_COURS, "Tache en cours d'exécution");
        enumMap.put(ETAT.EN_PAUSE, "Execution de la tache en pause");
        enumMap.put(ETAT.TERMINE, "Tache terminée");
        Iterator<ETAT> enumKeySet = enumMap.keySet().iterator();
        while (enumKeySet.hasNext()) {
            ETAT currentState = enumKeySet.next();
            System.out.println("cle : " + currentState + ", valeur : " + enumMap.get(currentState));
        }
    }
}
