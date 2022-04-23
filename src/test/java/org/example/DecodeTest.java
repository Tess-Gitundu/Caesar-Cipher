package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {
    @Test
    public void userInput_checkIfInputString_true() {

        Encode userInputTest = new Encode(3);
        assertEquals(true, userInputTest instanceof Encode);
    }
    @Test
    public void userInput_checkIfInputShifting_booleanTrue() {

        Encode userInputTest = new Encode(3);
        assertEquals(true, userInputTest instanceof Encode);
    }
}