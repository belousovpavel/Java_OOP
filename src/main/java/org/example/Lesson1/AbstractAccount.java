package org.example.Lesson1;

import java.math.BigDecimal;

public abstract class AbstractAccount implements Account{

    //Номер счета, валюта
//    private String number;
    private static long counter = 0L;
    //Неограниченный дробный точный тип данных (BigDecimal)
    private BigDecimal amount;

    protected AbstractAccount() {
        amount = BigDecimal.ZERO;
    }

    protected AbstractAccount(BigDecimal amount) {
        checkArgumentPositive(amount);

        this.amount = amount;
        counter++;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static long getCounter() {
        return counter;
    }

    @Override
    public void put(BigDecimal increase) {
        checkArgumentPositive(increase);
        if (canPut(increase)) {
            amount = amount.add(increase);
        }
    }

    protected abstract boolean canPut(BigDecimal increase);

    @Override
    public void take(BigDecimal decrease) {
        checkArgumentPositive(decrease);

        if(canTake(decrease)) {
            amount = amount.subtract(decrease);
        }
        else{
            throw new IllegalStateException("Невозможно снять средства");
        }
    }

    protected abstract boolean canTake(BigDecimal decrease);

    private void checkArgumentPositive(BigDecimal arg){
        if (arg.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Аргумент должен быть положительным");
        }
    }

}