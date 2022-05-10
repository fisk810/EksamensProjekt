package com.company.Entity;

import java.util.ArrayList;

public class CaseContainer {
    private ArrayList<Case> caseList = new ArrayList<>();

    public ArrayList<Case> getCaseList() {
        return caseList;
    }

    public CaseContainer(){
        caseList.add(new Case(new Customer("lars sørensen"),
                new Employee("christian", " jørgensen", "snerlevej 191", "4700", "Næstved", "60476662"),
                "f01594", "snerlevej 191", "4700", "Næstved"));

        caseList.add(new Case(new Customer("lars sørensen"),
                new Employee("christian", " jørgensen", "snerlevej 191", "4700", "Næstved", "60476662"),
                "f01594", "jordbærgade 11", "3300", "København"));

        caseList.add(new Case(new Customer("lars sørensen"),
                new Employee("christian", " jørgensen", "snerlevej 191", "4700", "Næstved", "60476662"),
                "f01594", "snerlevej 11", "4700", "Næstved"));

        caseList.add(new Case(new Customer("lars sørensen"),
                new Employee("christian", " jørgensen", "snerlevej 191", "4700", "Næstved", "60476662"),
                "f01594", "hjørnet", "4760", "Vordingborg"));
    }
}
