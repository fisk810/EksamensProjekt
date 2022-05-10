package com.company.UseCase;

import com.company.Entity.Case;

import java.util.ArrayList;
import java.util.List;

public class EditCase {


    //denne metode skal kører i et while(rs.next) i databasen. metoden fungerer som en slags
    //pseudo constructor, i og med at den opretter arrayet i EditCase klassen.


/*
    public List<String> createAddressArray(){
        ArrayList<String> customerAddress = new ArrayList<>();
        for (int i = 0; i < caseList.size(); i++) {
            customerAddress.add(caseList.get(i).getAddress());
            customerAddress.add(caseList.get(i).getZipCode());
            customerAddress.add(caseList.get(i).getCity());
        }
        return customerAddress;
    }

 */

    public List<Case> sortCasesByindex(List<Case> cases, List<Integer> indexList){
        ArrayList<Case> sortedCases = new ArrayList<>();
        for (int i = 0; i < indexList.size(); i++) {
            sortedCases.add(cases.get(indexList.get(i)));
        }
        return sortedCases;
    }

    public void sortStringsAlphabetically(List<String> c)
    {
        String temp;
        int n = c.size();
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (c.get(j).compareTo(c.get(i)) > 0)
                {
                    temp = c.get(j);
                    c.set(j, c.get(i));
                    c.set(i, temp);
                }
            }
        }
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
