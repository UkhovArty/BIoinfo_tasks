package task1;

import java.util.*;

public class FrequentWords {
    public static List<String> mostFrequent = new ArrayList<>();
    public static String pattern = "";
    public static List<String> frequentPatterns (String text, int k) {
        Integer[] counters = new Integer[text.length() - k + 1];
        for (int i = 0; i <= text.length() - k; i++) {
            pattern = text.substring(i, k + i);
            counters[i] = Counter.count(text, pattern);
        }
        int max = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > max) {
                max = counters[i];
            }

        }
        for (int i = 0; i <= text.length() - k; i++) {
            if (counters[i] == max) {
                mostFrequent.add(text.substring(i, k + i));
            }
        }
        Set<String> set = new HashSet<>(mostFrequent);
        mostFrequent.clear();
        mostFrequent.addAll(set);
        return mostFrequent;
    }
}
