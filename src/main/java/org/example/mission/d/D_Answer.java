package org.example.mission.d;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D_Answer {
    private List<Transaction> transactions;

    public D_Answer() {
        Trader kyu = new Trader("Kyu", "Seoul");
        Trader ming = new Trader("Ming", "Gyeonggi");
        Trader hyuk = new Trader("Hyuk", "Incheon");
        Trader hwan = new Trader("Hwan", "Seoul");
        transactions = Arrays.asList(
                new Transaction(kyu, 2019, 30000),
                new Transaction(kyu, 2020, 12000),
                new Transaction(ming, 2020, 40000),
                new Transaction(ming, 2020, 7100),
                new Transaction(hyuk, 2019, 5900),
                new Transaction(hyuk, 2020, 4900)
        );
    }

    // 1. 2020년에 일어난 모든 거래 내역을 찾아 거래값을 기준으로 오름차순 정렬하라.
    public void getTransactionsIn2020() {
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2020)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);
    }

    // 2. 거래 내역이 있는 거래자가 근무하는 모든 도시를 중복 없이 나열하라.
    public void getCitiesOfTraders() {
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
    }

    // 3. 서울에서 근무하는 모든 거래자를 찾아서 이름순서대로 정렬하라.
    public void getTradersInSeoul() {
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity().equals("Seoul"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
    }

    // 4. 모든 거래자의 이름을 순서대로 정렬하라.
    public void getTradersName() {
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    // 5. 부산에 거래자가 있는지를 확인하라.
    public void isThereTraderInBusan() {
        boolean isThereTraderInBusan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Busan"));
        System.out.println(isThereTraderInBusan);
    }

    // 6. 서울에 거주하는 거래자의 모든 거래 내역을 구하라.
    public void getTransactionsOfTradersInSeoul() {
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Seoul"))
                .forEach(System.out::println);
    }

    // 7. 모든 거래 내역중에서 최댓값과 최솟값을 구하라. 단, 최댓값은 reduce를 이용하고 최솟값은 stream의 min()을 이용하라.
    public void getMaxAndMinValue() {
        transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .ifPresent(System.out::println);
        transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compareTo)
                .ifPresent(System.out::println);
    }

}
