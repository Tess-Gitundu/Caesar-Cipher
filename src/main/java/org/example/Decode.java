package org.example;

public class Decode {
    private char[] decoder =  new char[26];
    protected String userPlainText;

    public Decode(int rotation) {

        for (int k = 0; k < 26; k++) {

                decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
            }

        }


    public String getUserPlainTextText(String userPlainText) {
        return shifted(userPlainText, decoder);
    }

//    public String shifted(String original, char[] code) {
//        char[] text = original.toCharArray();
//        for (int k = 0; k < text.length; k++)
//            if (Character.isUpperCase(text[k])) {
//                int j = text[k] - 'A';
//                text[k] = code[j];
//            }
//        return new String(text);
    }
}
