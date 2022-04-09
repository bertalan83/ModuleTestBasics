package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_Bonus_WillTheyFight {

    @Test
    void test_willTheyFight_if_true() {
        boolean willTheyFight = Practice.willTheyFight(0, 3, 0, 3);
        assertTrue(willTheyFight);

        willTheyFight = Practice.willTheyFight(0, 3, 0, 1);
        assertTrue(willTheyFight);

        willTheyFight = Practice.willTheyFight(0, 3, 3, 2);
        assertTrue(willTheyFight);

        willTheyFight = Practice.willTheyFight(1500000, 999, 500000, 1999);
        assertTrue(willTheyFight);
    }

    @Test
    void test_willTheyFight_if_false() {
        boolean willTheyFight = Practice.willTheyFight(0, 3, 1, 3);
        assertFalse(willTheyFight);

        willTheyFight = Practice.willTheyFight(1, 3, 0, 3);
        assertFalse(willTheyFight);

        willTheyFight = Practice.willTheyFight(2, 2, 1, 2);
        assertFalse(willTheyFight);

        willTheyFight = Practice.willTheyFight(0, 2, 1, 3);
        assertFalse(willTheyFight);

        willTheyFight = Practice.willTheyFight(3, 3, 2, 5);
        assertFalse(willTheyFight);
    }

}