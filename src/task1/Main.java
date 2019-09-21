package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println(FrequentWords.frequentPatterns(text, k));
    }
}