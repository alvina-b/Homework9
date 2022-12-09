public class Main {
    public static void main(String[] args) {
         //Задача 1
        System.out.println("  Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println( "Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        System.out.println("  Задача 2");

        int max = -1;
        int min = 201000;
        for (int current : arr) {
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Максимальная сумма трат составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат составила " + min + " рублей.");

        //Задача 3
        System.out.println("  Задача 3");
        float average = 1f;
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Задача 4
        System.out.println("  Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}