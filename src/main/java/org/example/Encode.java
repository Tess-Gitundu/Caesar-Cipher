package org.example;

public class Encode {

    private char[] encoder = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    protected String userText;
    public Encode( int rotation ) {

        for (int k = 0; k < 26; k++) {
            if (k>26){
                k = k-26;
                encoder[k] = (char) ((k + rotation ));
            }
        }

    }
    public String getUserText(String userText) {
        return shifted( userText, encoder);
    }
    public  String shifted(String original , char[] code) {
        char[] text = original.toCharArray();
        for (int k = 0; k < text.length; k++)
            if (Character.isUpperCase(text[k])) {
                int j = text[k] - 'A';
                text[k] = code[j];
            }
        return new String(text);
    }
}