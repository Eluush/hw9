public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] money = new int[5];
        money[0] = 20_000;
        money[1] = 30_000;
        money[2] = 10_000;
        money[3] = 50_000;
        money[4] = 60_000;
        int allMoney = 0;
        for (int i = 0; i < money.length; i++) {
            allMoney += money[i];
        }
        System.out.println("Сумма выплат за месяц составила " + allMoney + " рублей");


        System.out.println("Задание 2");
        int[] weekend = {1_000, 2_000, 3_000, 4_000, 5_000};
        int minAmount = weekend[0];
        int maxAmount = weekend[0];
        for (int i = 0; i < weekend.length; i++) {
            if (weekend[i] < minAmount) {
                minAmount = weekend[i];
            }
            if (weekend[i] > maxAmount) {
                maxAmount = weekend[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей");


        System.out.println("Задание 3");
        int[] mounth = {1_000, 1_000, 1_000, 1_000, 1_000};
        int sum = 0;
        for (int i = 0; i < mounth.length; i++) {
            sum += mounth[i];
        }
        sum = sum / mounth.length;
        System.out.println(sum);

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }

        }


    }

