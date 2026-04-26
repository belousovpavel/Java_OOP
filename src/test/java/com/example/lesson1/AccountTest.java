package com.example.lesson1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testNewAccount(){
        // Тестируем, что аккаунт имеет 0 средств.
        AbstractAccount account = new AbstractAccount();

        assertEquals(BigDecimal.ZERO, account.getAmount());
    }

    @Test
    void testPutAmount(){
        AbstractAccount account = new AbstractAccount();
        account.put(BigDecimal.valueOf(120));

        assertEquals(BigDecimal.valueOf(120), account.getAmount());

        account.put(BigDecimal.TEN);
        assertEquals(BigDecimal.valueOf(130), account.getAmount());

        account.put(BigDecimal.ZERO);
        assertEquals(BigDecimal.valueOf(130), account.getAmount());
    }

    @Test
    void testPutNegativeValue(){
        AbstractAccount account = new AbstractAccount();
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                account.put(BigDecimal.valueOf(-120));
            }
        });

        assertEquals(BigDecimal.ZERO, account.getAmount());
    }

    @Test
    void testTake(){
        AbstractAccount account = new AbstractAccount();
        account.put(BigDecimal.valueOf(100));
        account.take(BigDecimal.valueOf(50));

        account.take(BigDecimal.valueOf(30));
        assertEquals(BigDecimal.valueOf(20), account.getAmount());

        assertThrows(IllegalStateException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                account.take(BigDecimal.valueOf(100));
            }
        });

    }

}