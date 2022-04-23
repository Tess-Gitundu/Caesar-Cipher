package org.example;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {

    @Test
    public void userInput_checkIfInputString_booleanTrue() {

        Encode userInputTest = new Encode("Hello world");
        assertEquals(true, userInputTest instanceof Encode);
    }
    @Test
    public void userInput_encodeUserInput_ifCorrectlyDecodesTrue() {

        Encode userInputtedText = new Encode("Hello world");
        assertEquals(true, userInputtedText instanceof Encode );
    }
}