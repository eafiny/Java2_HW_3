package HW1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{
          "Java", "Javascript", "Python","Ruby", "Pascal", "C++", "Java", "C",
          "C++", "Java", "Assembler", "DAX", "DAX", "Java", "Prolog"
        };
        Set<String> wordSet= new HashSet<>();
        System.out.println("Список уникальных слов в массиве:");
        for (String word:words) {
            if (wordSet.add(word)) System.out.println(word);
        }

        Map<String, Integer> wordCount = new HashMap<>();
        for (String s:wordSet) {
            wordCount.put(s,0);
        }
        for (String s:words) {
            wordCount.put(s, wordCount.get(s) + 1);
        }
        for (String key:words) {
            System.out.println("Слово " + key + " встречается " + wordCount.get(key) + "раз");
        }
    }
}
