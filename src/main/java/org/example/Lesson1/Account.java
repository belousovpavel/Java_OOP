package org.example.Lesson1;

import java.math.BigDecimal;

public class Account {

    //Номер счета, валюта
//    private String number;

    //Неограниченный дробный точный тип данных (BigDecimal)
    private BigDecimal amount;

    public Account() {
        amount = BigDecimal.ZERO;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void put(BigDecimal increase) {
        checkArgumentPositive(increase);
        amount = amount.add(increase);
    }

    public void take (BigDecimal decrease) {
        checkArgumentPositive(decrease);

        if(amount.compareTo(decrease) >= 0) {
            amount = amount.subtract(decrease);
        }
        else{
            throw new IllegalStateException("Недостаточно средств");
        }
    }

    private void checkArgumentPositive(BigDecimal arg){
        if (arg.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Аргумент должен быть положительным");
        }
    }

}