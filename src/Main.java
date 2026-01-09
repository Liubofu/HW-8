import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1!");

        int[] inputArray1 = {70, 400, 100, 250, 200};
        int minPay = inputArray1[0]; //мин выплата
        int maxPay = inputArray1[0]; //макс выплата
        int sumPay = 0; //сумма выплат
        int count = 0;
        for (int element : inputArray1) {
            if (element < minPay) { //узнаем минимальную выплату
                minPay = element;
            }
            if (element > maxPay) { //узнаем максимальную выплату
                maxPay = element;
            }
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
        int[] inputArray3 = {5_200, 4_800, 3_400, 6_000, 5_100};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int step = 0;
        for (int value : inputArray3) {
            if (value > 5000) {
                outputArray3[step] = true;
            } else {
                outputArray3[step] = false;
            }
            step++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("Задание 4!");

        int[] inputArray4 = {15, 23, 48, -2, 0};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;
        for (int number : inputArray4) {
            if (number < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println("Задание 5! ");

        int[] inputArray5 = {100_000, 49_000, -5_000, 50_000, 35_000};
        boolean[] outputArray5 = new boolean[inputArray5.length];
        int profitMonth = 0;
        for (int profit : inputArray3) {
            if (profit > 0) {
                outputArray5[profitMonth] = true;
            } else {
                outputArray5[profitMonth] = false;
            }
            profitMonth++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));

        //Задание 5 дубль

        int[] inputArray6 = {100_000, 49_000, -5_000, 50_000, 35_000};
        for (int num : inputArray6) {
            if (num > 0) {
                System.out.println(num);
            }
        }
    }
}