package org.example;


import org.example.mission.a.A_Answer;
import org.example.mission.b.B_Answer;
import org.example.mission.c.C_Answer;
import org.example.mission.d.D_Answer;
import org.example.mission.e.E_Answer;
import org.example.mission.f.F_Answer;

public class Main {
    public static void main(String[] args) {
        A_Answer a_answer = new A_Answer();
        System.out.println("[A_Answer]");
        System.out.println("--------------------");
        a_answer.howManyPeoplePreferEachHobby();
        System.out.println("--------------------");
        a_answer.howManyPeopleHaveTheSurnameJungWhoPreferEachHobby();
        System.out.println("--------------------");
        a_answer.howManyTimesTheWordLikeAppearsInIntroduction();
        System.out.println("--------------------");

        B_Answer b_answer = new B_Answer();
        System.out.println("[B_Answer]");
        System.out.println("--------------------");
        b_answer.HowManyPrefixesAreThereForEach();
        System.out.println("--------------------");
        b_answer.ConvertToUpperCaseAndJoin();
        System.out.println("--------------------");

        C_Answer c_answer = new C_Answer();
        System.out.println("[C_Answer]");
        System.out.println("--------------------");
        c_answer.getArrayListOfAllNumberPairs();
        System.out.println("--------------------");
        c_answer.getLargestProductOfAllNumberPairs();
        System.out.println("--------------------");

        D_Answer d_answer = new D_Answer();
        System.out.println("[D_Answer]");
        System.out.println("--------------------");
        d_answer.getTransactionsIn2020();
        System.out.println("--------------------");
        d_answer.getCitiesOfTraders();
        System.out.println("--------------------");
        d_answer.getTradersInSeoul();
        System.out.println("--------------------");
        d_answer.getTradersName();
        System.out.println("--------------------");
        d_answer.isThereTraderInBusan();
        System.out.println("--------------------");
        d_answer.getTransactionsOfTradersInSeoul();
        System.out.println("--------------------");
        d_answer.getMaxAndMinValue();
        System.out.println("--------------------");

        E_Answer e_answer = new E_Answer();
        System.out.println("[E_Answer]");
        System.out.println("--------------------");
        e_answer.sumOfLengths();
        System.out.println("--------------------");
        e_answer.longestLength();
        System.out.println("--------------------");
        e_answer.sortedLottoNumbers();
        System.out.println("--------------------");
        e_answer.diceSumOfSix();
        System.out.println("--------------------");

        F_Answer f_answer = new F_Answer();
        System.out.println("[F_Answer]");
        System.out.println("--------------------");
        f_answer.getNumberOfFailStudents();
        System.out.println("--------------------");
        f_answer.getTotalScoresByGrade();
        System.out.println("--------------------");
    }
}