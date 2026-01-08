import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1!");

        int[] inputArray1 = {70, 400, 100, 250, 200};
        int minPay = 401; //мин выплата
        int maxPay = 0; //макс выплата
        int sumPay = 0; //сумма выплат
        int count = 0;
        for (int min : inputArray1) {
            if (min < minPay) { //узнаем минимальную выплату
                minPay = min;
            }
        }
        for (int max : inputArray1) {
            if (max > maxPay) { //узнаем максимальную выплату
                maxPay = max;
            }
        }
        for (int element : inputArray1) {
            sumPay += element; // узнаем сумму выплат
            count++;
        }
        double midPay = (double) sumPay / count; //среднее значение

        double[] outputArray1 = new double[4];
        outputArray1[0] = minPay;
        outputArray1[1] = maxPay;
        outputArray1[2] = sumPay;
        outputArray1[3] = midPay;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("Задание 2!");

        double[] inputArray2 = {35_000, 43_500, 41_000, 54_400, 39_800};
        double[] outputArray2 = new double[inputArray2.length];
        double taxRate = 0.13; //ставка налога 13%
        int index = 0;
        for (double number : inputArray2) {
            outputArray2[index] = number * taxRate;
            index++;
        }
        System.out.println("Зарплаты - " + Arrays.toString(inputArray2));
        System.out.println("Налоги - " + Arrays.toString(outputArray2));

        System.out.println("Задание 3!");
        int[] inputArray3 = {5_200, 4_800, 3_400, 6_000, 5_100};// ищем бонус свыше 5000
        boolean outputArray3 = false;
        for (int num : inputArray3) {
            if (num > 5000) {
                outputArray3 = true;
                break;
            }
        }
        if (outputArray3) {
            System.out.println("В массиве есть бонусы свыше 5000.");
        } else {
            System.out.println("В массиве нет бонусов свыше 5000.");
        }

        System.out.println("Задание 4!");

        int[] inputArray4 = {15, 23, 48, -2, 0};
        boolean outputArray4 = true;
        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);

        System.out.println("Задание 5! ");

        int[] inputArray5 = {100_000, 49_000, 48_500, 50_000, 35_000};
        int outputArray5 = 0; //назначаем счетчик
        for (int number : inputArray5) {
            if (number > 0);
            outputArray5++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println("Количество месяцев с положительной прибылью: " + outputArray5);
    }
}