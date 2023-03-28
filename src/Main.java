import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    /*
1. Scanner
2. сканнер принимает арифметическую операцию, например 2 + 2 = 4
3. нужно посчитать и добавить оперцию в HashMap (ключ сама операция, значение - результат)
4. Перед тем как посчитать, нужно проверить нет ли уже таких данных в HashMap, если есть, то отдать из HashMap
5. Результат выводим на консоль

4. Перед тем как посчитать, нужно проверить нет ли уже таких данных в HashMap, если есть, то отдать из HashMap
     */
    static String builder(int first, String operation, int second) {
        StringBuilder builder = new StringBuilder();
        builder.append(first);
        builder.append(operation);
        builder.append(second);
        return builder.toString();
    }

    static String builder1(int sum) {
        StringBuilder builder = new StringBuilder();
        // sum = first+second;
        builder.append(sum);
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>(100);
        int first;
        String operation;
        int second;
        int sum;
        for (int i = 0; i < 100; i++) {
            System.out.println("введите первое число: ");
            first = scanner.nextInt();
            System.out.println("введите операцию: ");
            operation = scanner.next();
            System.out.println("введите второе число: ");
            second = scanner.nextInt();
            if (map.containsKey(builder(first, operation, second))) {
                System.out.println(map.get(builder(first,operation,second)));
                System.out.println(map);}
            switch (operation) {
                case "+":
                    sum = first + second;
                    map.put(builder(first, operation, second), String.valueOf(sum));
                    break;
                case "-":
                    sum = first - second;
                    map.put(builder(first, operation, second), String.valueOf(sum));
                    break;
                case "*":
                    sum = first * second;
                    map.put(builder(first, operation, second), String.valueOf(sum));
                    break;

                case "/":
                    sum = first / second;
                    map.put(builder(first, operation, second), String.valueOf(sum));
                    break;
            }

        }
    }
}
