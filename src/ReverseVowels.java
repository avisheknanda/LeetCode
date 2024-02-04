public class ReverseVowels {

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] letters = s.toCharArray();
        while (start < end) {
            if (!isVowel(letters[start])) {
                start++;
            } else if (!isVowel(letters[end])) {
                end--;
            } else {
                char temp = letters[start];
                letters[start] = letters[end];
                letters[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(letters);
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U';
    }
}
