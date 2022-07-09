import java.util.*;

public class Main {


    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
    }

    private static void doTask1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num);
            }
        }
        System.out.println();
    }


    private static void doTask2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> result = new TreeSet<>(nums);
        for (Integer num : result) {
            if (num % 2 == 0) {
                System.out.print(num);

            }
        }
        System.out.println();
    }


    private static void doTask3() {
        List<String> words = List.of("Привет", "хорошо", "да", "нет", "Привет", "нет", "пока", "письмо", "Книга");
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
    }

    private static void doTask4() {
        List<String> words = List.of("Привет", "хорошо", "да", "да", "нет", "Привет", "нет", "пока", "письмо", "Книга");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        System.out.println(result);
        }
}