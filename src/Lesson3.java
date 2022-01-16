import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lesson3 {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));

    }
    public static String maxNumberFromDigits(int[] digits){
//        String result = ""; //O(1)
//        Arrays.sort(digits); //O(n*log(n))
//        for (int i = digits.length - 1; i >= 0; i--){ //O(n)
//            result += digits[i];
//        }
//        return result;
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf).toArray(String[]::new));
    }//создаем поток для работы с лямбдо-выражениями(stream()),
    // boxed() оборачиваем в классы обертки, сортируем sorted(),
    // сортируем в обратном порядке reverseOrder(),
    // map() переводим целые числа в строки,
    // toArray() переводим в массив, join() объединяем полученный массив в одну строку

}
