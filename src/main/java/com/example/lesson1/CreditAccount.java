package com.example.lesson1;

import java.math.BigDecimal;

public class CreditAccount extends AbstractAccount {

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

    @Override
    protected boolean canPut(BigDecimal increase) {
        return true;
    }

    @Override
    protected boolean canTake(BigDecimal decrease) {
        return decrease.compareTo(getAmount()) >= 0;
    }
}
