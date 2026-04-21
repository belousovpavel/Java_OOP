package com.example.lesson1;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private final BigDecimal commission;

    public CreditAccount(){
        this(BigDecimal.valueOf(0.01));
    }
    public CreditAccount(BigDecimal commission) {
        this.commission = commission;
    }

    @Override
    public void take(BigDecimal decrease) {
        super.take(decrease.multiply(BigDecimal.ONE.add(commission)));
    }
}
