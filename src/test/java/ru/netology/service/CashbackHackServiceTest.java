package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldNotReturnCashbackIfAmountIs1000() {
        CashbackHackService cashbackHackService;
        cashbackHackService = new CashbackHackService();
        System.out.println();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCashbackIfAmountIsNot1000() {
        CashbackHackService cashbackHackService;
        cashbackHackService = new CashbackHackService();
        System.out.println();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}