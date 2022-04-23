package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    public void userInput_checkIfInputString_true() {

        Decode userInputTest = new Decode(3);
        assertEquals(true, userInputTest instanceof Decode);
    }
    @Test
    public void userInput_checkIfInputShifting_booleanTrue() {

        Decode userInputTest = new Decode(3);
        assertEquals(true, userInputTest instanceof Decode);
    }
}