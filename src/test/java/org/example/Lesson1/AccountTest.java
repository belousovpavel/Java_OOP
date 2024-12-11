package org.example.Lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    //JUnit
    // my-app.jar <- jinit.jar

    @Test
    void testNewAccount(){
        // Тестируем, что новый акаунт имеет 0 средств
        Account account = new Account();
        //assert account.getAmount() == BigDecimal.ZERO;
        assertEquals(BigDecimal.ZERO, account.getAmount());
    }

    @Test
    void testPutAmount(){
        Account account = new Account();
        account.put(BigDecimal.valueOf(120));

        assertEquals(BigDecimal.valueOf(120), account.getAmount());

        account.put(BigDecimal.valueOf(10));
        assertEquals(BigDecimal.valueOf(130), account.getAmount());

        account.put(BigDecimal.ZERO);
        assertEquals(BigDecimal.valueOf(130), account.getAmount());
    }

    @Test
    void testPutNegativeValue(){
        Account account = new Account();
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
        Account account = new Account();
        account.put(BigDecimal.valueOf(100));

        account.take(BigDecimal.valueOf(50));
        assertEquals(BigDecimal.valueOf(50), account.getAmount());

        account.take(BigDecimal.valueOf(25));
        assertEquals(BigDecimal.valueOf(25), account.getAmount());
        assertThrows(IllegalStateException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                account.take(BigDecimal.valueOf(100));
            }
        });
        assertEquals(BigDecimal.valueOf(25), account.getAmount());
    }

}