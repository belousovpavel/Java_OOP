package com.example.lesson1;

import org.junit.jupiter.api.Test;

import javax.script.ScriptEngine;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void testTake(){
        CreditAccount account = new CreditAccount(BigDecimal.valueOf(0.01));
        account.put(BigDecimal.valueOf(200));

        account.take(BigDecimal.valueOf(100));

        assertEquals(0, BigDecimal.valueOf(99).compareTo(account.getAmount()));

//        assertEquals(BigDecimal.valueOf(99), account.getAmount()) ;

    }


}