package org.example.Lesson1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositAccount extends AbstractAccount {

    private LocalDate lastTake;

    public DepositAccount(){
        lastTake = LocalDate.now().minusMonths(2);
    }

    @Override
    public void take(BigDecimal decrease) {
        super.take(decrease);
        lastTake = LocalDate.now();
    }

    //    @Override
//    public void take(BigDecimal decrease) {
//        // lastTake = 2024-06-26
//        // now - 2024-06-26
//        // now - 1month = 2024 - 05 26
//
//        if (LocalDate.now().minusMonths(1).isAfter(lastTake)){
//            super.take(decrease);
//            lastTake = LocalDate.now();
//        } else {
//            throw new IllegalArgumentException("Нельзя снть: не прощел период");
//        }
//    }

    @Override
    protected boolean canPut(BigDecimal increase) {
        return true;
    }

    @Override
    protected boolean canTake(BigDecimal decrease) {
        return LocalDate.now().minusMonths(1).isAfter(lastTake);
    }
}
