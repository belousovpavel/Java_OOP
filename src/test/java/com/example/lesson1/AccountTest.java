package com.example.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testNewAccount() {
        // Тестируем что новый аккаунт имеет ноль средств
        AbstractAccount account = new AbstractAccount();
        assertEquals(BigDecimal.ZERO, account.getAmount());
    }

    @Test
    void testPutAmount() {
        AbstractAccount account = new AbstractAccount();
        account.put(BigDecimal.valueOf(100));

        assertEquals(BigDecimal.valueOf(100), account.getAmount());

        account.put(BigDecimal.TEN);
        assertEquals(BigDecimal.valueOf(110), account.getAmount());

        account.put(BigDecimal.ZERO);
        assertEquals(BigDecimal.valueOf(110), account.getAmount());
    }

    @Test
    void testPutNegative() {
        AbstractAccount account = new AbstractAccount();

        Assertions.assertThrows(IllegalArgumentException.class, () -> account.put(BigDecimal.valueOf(-100)));

        Assertions.assertEquals(BigDecimal.ZERO, account.getAmount());

    }

}