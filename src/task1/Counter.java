package task1;

public class Counter {
    public static String text;
    public static String pattern;
    public static int count(String text,String pattern) {
        int counter = 0;
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            boolean subText = text.regionMatches(true, i, pattern, 0, pattern.length());
            if (subText) {
                counter += 1;
            }
        }
        return counter;
    }
}
