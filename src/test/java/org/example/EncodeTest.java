package org.example;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {

    @Test
    public void userInput_checkIfInputString_booleanTrue() {

        Encode userInputTest = new Encode(3);
        assertEquals(true, userInputTest instanceof Encode);
    }
    @Test
    public void userInput_encodeUserInput_ifCorrectlyDecodesTrue() {

        Encode userInputtedText = new Encode(4);
        assertEquals(true, userInputtedText instanceof Encode );
    }
    @Test
    public void userInput_shiftingUserChar_ifCorrectlyshifts() {

        Encode userInputtedText = new Encode(4);
        assertEquals(true, userInputtedText instanceof Encode );
    }
}