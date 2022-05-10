package com.company;

import com.company.Entity.CaseContainer;
import com.company.UseCase.EditCase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CaseContainer cc = new CaseContainer();
        EditCase e = new EditCase();
        System.out.println(e.getSearchedCases(cc.getCaseList(), "snerle"));

    }


}
