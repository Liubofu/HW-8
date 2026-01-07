import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1!");

        int[] inputArray1 = {70, 400, 100, 250, 200};
        int sumPay = 0; //сумма выплат
        int maxPay = 0; //макс выплата
        int minPay = 401; //мин выплата
        double midPay = 0; //среднее значение
        for (int element : inputArray1) {
            sumPay = sumPay + element; // узнаем сумму выплат
        }

        for (int max : inputArray1) {
            if (max > maxPay) { //узнаем максимальную выплату
                maxPay = max;
            }
        }

        for (int i = 0; i < inputArray1.length; i++) {
            if (inputArray1[i] < minPay) { //узнаем минимальную выплату
                minPay = inputArray1[i];
            }
        }

        for (double mid : inputArray1) { //узнаем среднее значение выплат
            midPay = sumPay / inputArray1.length;
        }

        double[] outputArray1 = new double[4];
        outputArray1[0] = sumPay;
        outputArray1[1] = maxPay;
        outputArray1[2] = minPay;
        outputArray1[3] = midPay;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("Задание 2!");

        int[] inputArray2 = {35_000, 43_500, 41_000, 54_400, 39_800};
        float[] outputArray2 = new float[5];
        for (int i = 0; i < inputArray2.length; i++) {
            float tax = inputArray2[i] * 0.13f;
            outputArray2[i] = tax;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println("Задание 3!");

        int[] inputArray3 = {5_200, 4_800, 3_400, 6_000, 5_100};
        boolean[] outputArray3 = new boolean[5];
        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true;
            } else {
                outputArray3[i] = false;
            }
            System.out.println(outputArray3[i]);
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