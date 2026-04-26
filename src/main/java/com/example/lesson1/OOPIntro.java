package com.example.lesson1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOPIntro {

    public static void main(String[] args) {
        //1. Создали базовый класс счета, на котором есть какая-то сумма.
        //Счет можно пополнять и можно из него забирать средства
        // Класс инкапсулирует в себе банковский счет (возможность пополнения и снятия)

        // 2. Создадим еще 2 счета: кредитный и депозитный
        // Кредитный счет предполагает, что любое снятие происходит с комиссией в размере 1 процента
        // Депозитный счет предполагает ограничение в частоте снятия: не чаще раза в день.

        // 3. Полиморфизм - способность функции работать с подтипами (в плане наследования)
        // своего аргумента без ограничений.

        AbstractAccount account = new AbstractAccount(BigDecimal.TEN);

        printAccount(new AbstractAccount());
        printAccount(new DepositAccount());
        printAccount(new CreditAccount());

        List<AbstractAccount> accounts = new ArrayList<>();
        accounts.add(new AbstractAccount());
        accounts.add(new DepositAccount());
        accounts.add(new CreditAccount());

    }

    private static void printAccount(AbstractAccount account) {
        System.out.println("Account = " + account.getClass().getName() + ", current amount = " + account.getAmount());
    }

}
