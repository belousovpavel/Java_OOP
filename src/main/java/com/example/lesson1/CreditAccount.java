package com.example.lesson1;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private final BigDecimal commission;

    public CreditAccount(){
        super();
        this .commission = BigDecimal.valueOf(0.01);
    }


    public CreditAccount(BigDecimal commission) {
        super(commission);
        this.commission = commission;
    }

    @Override
    public void take(BigDecimal decrease) {
        // multiply - увеличение комиссии
        super.take(decrease.multiply(BigDecimal.ONE.add(commission)));
    }
}
