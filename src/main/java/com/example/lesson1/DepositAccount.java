package com.example.lesson1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositAccount extends Account {

    private LocalDate lastTake;

    public DepositAccount() {
        super();
        lastTake = LocalDate.now().minusMonths(2);
    }

    public DepositAccount(BigDecimal amount){
        super (amount);
    }



    @Override
    public void take(BigDecimal decrease) {
        if (LocalDate.now().minusMonths(1).isAfter(lastTake)) {
            super.take(decrease);
            lastTake = LocalDate.now();
        }
        throw new IllegalArgumentException("Нельзя снять");
    }
}
