import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();

        characterIntegerHashMap.put('I', 1);
        characterIntegerHashMap.put('V', 5);
        characterIntegerHashMap.put('X', 10);
        characterIntegerHashMap.put('L', 50);
        characterIntegerHashMap.put('C', 100);
        characterIntegerHashMap.put('D', 500);
        characterIntegerHashMap.put('M', 1000);

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && characterIntegerHashMap.get(s.charAt(i)) < characterIntegerHashMap.get(s.charAt(i + 1))) {
                answer -= characterIntegerHashMap.get(s.charAt(i));
            } else {
                answer += characterIntegerHashMap.get(s.charAt(i));
            }
        }
        return answer;
    }
}
