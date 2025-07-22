package org.example.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class OOPintro {
    public static void main(String[] args) {
        //JUnit
        // my-app.jar <- jinit.jar
        // 1. Создали базовый класс счета, на котором есть какая-то сумма
        // Счет можно пополнять и можно из него забирать средства.
        // Класс инкапсулирует в себе банковский счет(возможность поплнять и снимать срества)

        //2. Создадим еще 2 счета: кредитный и депозитный
        // Кредитный счет предполагает, что любое снятие происходит с комиссией в 1 процент
        // Депозитный счет предполагает ограничение снятия: не чаще раза в день.
        // Урезанный депозитный счет предполагает в частоте снятия: максимум n раз

        // 3. Полиморфизм - это способность функции (структуры)
        // работать с подтипами (в плане наследования)
        // своего аргумента.

        printAccountState(new Account());
        printAccountState(new DepositAccount());
        printAccountState(new CreditAccount());

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account());
        accounts.add(new DepositAccount());
        accounts.add(new CreditAccount());

    }

    private static void printAccountState(Account account) {
        System.out.println("Account = " + account.getClass().getName() + ", current account = " + account.getAmount());
    }

}
