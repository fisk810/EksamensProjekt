package com.company.UseCase;

import com.company.Entity.Case;

import java.util.ArrayList;
import java.util.List;

public class EditCase {

    public List<Case> sortCasesByindex(List<Case> cases, List<Integer> indexList){
        ArrayList<Case> sortedCases = new ArrayList<>();
        for (int i = 0; i < indexList.size(); i++) {
            sortedCases.add(cases.get(indexList.get(i)));
        }
        return sortedCases;
    }

    public List<Case> getSearchedCases(List<Case> cases, String input){
        return sortCasesByindex(cases, findCaseMatchingInput(cases, input));
    }

    public List<Integer> findCaseMatchingInput(List<Case> cases, String input){
        ArrayList<Integer> matchingCasesIndex = new ArrayList<>();
        for (int i = 0; i < cases.size(); i++) {
            if(checkIfStringMatchesInput(cases.get(i).getAddress(), input)){
                matchingCasesIndex.add(i);
            }
        }
        return matchingCasesIndex;
    }
    //skal lægge i general use-case
    public boolean checkIfStringMatchesInput(String s, String input){
            return s.matches("(.*)" + input + "(.*)");
    }







}
