package org.example.Lesson1;

import java.math.BigDecimal;

public class Account{

    //Номер счета, валюта
//    private String number;
//    private static long counter = 0L;
    //Неограниченный дробный точный тип данных (BigDecimal)
    private BigDecimal amount;

    public Account() {
        amount = BigDecimal.ZERO;
    }

    public void put(BigDecimal increase) {
        checkArgumentPositive(increase);
        amount = amount.add(increase);
    }

    public void take (BigDecimal decrease) {
        checkArgumentPositive(decrease);

        if (amount.compareTo(decrease) >= 0) {
            amount = amount.subtract(decrease);
        }
        else{
            throw new IllegalStateException("Not enough money");
        }
    }

    public BigDecimal getAmount() {
        return amount;
    }

    private void checkArgumentPositive(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

}