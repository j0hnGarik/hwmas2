public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] expenses = {1000, 2000, 1500, 3000, 2500};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        System.out.println("task 2");
        int[] expenses1 = {1000, 2000, 1500, 3000, 2500};
        int minExpense = expenses[0];
        int maxExpense = expenses[0];

        for (int expense : expenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");
        System.out.println("task 3");
        int[] expenses2 = {1000, 2000, 1500, 3000, 2500};
        int total1 = 0;
        for (int expense2 : expenses2) {
            total1 += expense2;
        }
        double average = (double) total1 / expenses2.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println("taska 4");
        char[] reverseFullName = { 'I', 'v', 'a', 'n', 'o', 'v', ' ', 'I', 'v', 'a', 'n'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
    }
}}