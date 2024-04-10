package leetcode;

/*
Сдвиг символов и написание гласных с заглавной буквы
https://www.youtube.com/watch?v=Lw4gg7tkWQE
 */

public class ShiftCharactersAndCapitalizeVowels {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String VOWELS = "aeiou";

    public static String apply(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int index = ALPHABET.indexOf(ch);
            if (index != -1) {
                index = (index + 1) % ALPHABET.length();
                chars[i] = capitalizeVowels(ALPHABET.charAt(index));
            }
        }
        return new String(chars);
    }

    private static char capitalizeVowels(char ch) {
        if (VOWELS.indexOf(ch) != -1) {
            return Character.toUpperCase(ch);
        }
        return ch;
    }
}
