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
        System.out.println("[1번 문제 모음]");
        System.out.println("*** 문제 1.1 ***");
        a_answer.howManyPeoplePreferEachHobby();
        System.out.println("*** 문제 1.2 ***");
        a_answer.howManyPeopleHaveTheSurnameJungWhoPreferEachHobby();
        System.out.println("*** 문제 1.3 ***");
        a_answer.howManyTimesTheWordLikeAppearsInIntroduction();
        System.out.println();

        B_Answer b_answer = new B_Answer();
        System.out.println("[2번 문제 모음]");
        System.out.println("*** 문제 2.1 ***");
        b_answer.HowManyPrefixesAreThereForEach();
        System.out.println("*** 문제 2.2 ***");
        b_answer.ConvertToUpperCaseAndJoin();
        System.out.println();

        C_Answer c_answer = new C_Answer();
        System.out.println("[3번 문제 모음]");
        System.out.println("*** 문제 3.1 ***");
        c_answer.getArrayListOfAllNumberPairs();
        System.out.println("*** 문제 3.2 ***");
        c_answer.getLargestProductOfAllNumberPairs();
        System.out.println("*** 문제 3.3 ***");

        D_Answer d_answer = new D_Answer();
        System.out.println("[4번 문제 모음]");
        System.out.println("*** 문제 4.1 ***");
        d_answer.getTransactionsIn2020();
        System.out.println("*** 문제 4.2 ***");
        d_answer.getCitiesOfTraders();
        System.out.println("*** 문제 4.3 ***");
        d_answer.getTradersInSeoul();
        System.out.println("*** 문제 4.4 ***");
        d_answer.getTradersName();
        System.out.println("*** 문제 4.5 ***");
        d_answer.isThereTraderInBusan();
        System.out.println("*** 문제 4.6 ***");
        d_answer.getTransactionsOfTradersInSeoul();
        System.out.println("*** 문제 4.7 ***");
        d_answer.getMaxAndMinValue();
        System.out.println();

        E_Answer e_answer = new E_Answer();
        System.out.println("[5번 문제 모음]");
        System.out.println("*** 문제 5.1 ***");
        e_answer.sumOfLengths();
        System.out.println("*** 문제 5.2 ***");
        e_answer.longestLength();
        System.out.println("*** 문제 5.3 ***");
        e_answer.sortedLottoNumbers();
        System.out.println("*** 문제 5.4 ***");
        e_answer.diceSumOfSix();
        System.out.println();

        F_Answer f_answer = new F_Answer();
        System.out.println("[6번 문제 모음]");
        System.out.println("*** 문제 6.1 ***");
        f_answer.getNumberOfFailStudents();
        System.out.println("*** 문제 6.2 ***");
        f_answer.getTotalScoresByGrade();
        System.out.println();
    }
}