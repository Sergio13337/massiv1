import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }


//Задание 1 Объявите три массива:
//1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.

        int[] inBox = new int[3];
        inBox[0] = 1;
        inBox[1] = 2;
        inBox[2] = 3;
// Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

        double[] share = new double[]{1.57, 7.654, 9.986};

//Создать любой массив.
        int[] key = {2, 4, 8, 6, 4, 6};

        //Задание 2 Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        int[] cars1 = new int[3];
        cars1[0] = 1;
        cars1[1] = 2;
        cars1[2] = 3;
        for (int i = 0; cars1.length > i; i++) {
            if (i == cars1.length - 1) {
                System.out.print(cars1[i] + "---");
            } else
                System.out.print(cars1[i] + ",");
        }


        double[] share1 = new double[3];
        share1[0] = 1.57;
        share1[1] = 7.654;
        share1[2] = 9.986;
        for (int i = 0; share1.length > i; i++) {
            if (i == share1.length - 1) {
                System.out.print(share1[i] + "---");
            } else
                System.out.print(share1[i] + ",");

        }


        int[] key1 = new int[6];
        key1[0] = 2;
        key1[1] = 4;
        key1[2] = 8;
        key1[3] = 6;
        key1[4] = 4;
        key1[5] = 6;
        for (int i = 0; key1.length > i; i++) {
            if (i == key1.length - 1) {
                System.out.print(key1[i] + "---");
            } else
                System.out.print(key1[i] + ",");

        }

        //Задание 3 Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        //
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //
        //1.57, 7.654, 9.986
        //
        //*произвольные элементы третьего массива*
        //
        //То в третьем задании результат должен быть
        //
        // 3, 2, 1
        //
        //9.986, 7.654, 1.57
        //
        //*произвольные элементы третьего массива в обратном порядке*


        int[] cars11 = new int[3];
        cars11[0] = 1;
        cars11[1] = 2;
        cars11[2] = 3;
        for (int i = cars11.length - 1; i >= 0; i--) {
            if (i == cars11.length - 3) {
                System.out.print(cars11[i] + "---");
            } else
                System.out.print(cars11[i] + ",");
        }


        double[] share11 = new double[3];
        share11[0] = 1.57;
        share11[1] = 7.654;
        share11[2] = 9.986;
        for (int i = share11.length - 1; i >= 0; i--) {
            if (i == share11.length - 3) {
                System.out.print(share11[i] + "---");
            } else
                System.out.print(share11[i] + ",");
        }


        int[] key11 = new int[6];
        key11[0] = 2;
        key11[1] = 4;
        key11[2] = 8;
        key11[3] = 6;
        key11[4] = 4;
        key11[5] = 6;
        for (int t = key11.length - 1; t >= 0; t--) {
            if (t == key11.length - 6) {
                System.out.print(key11[t] + "---");
            } else
                System.out.print(key11[t] + ",");
        }

        //Задание 4 Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //
        //Распечатайте результат преобразования в консоль.
        //


        int[] cars12 = new int[3];
        cars12[0] = 1;
        cars12[1] = 2;
        cars12[2] = 3;
        int car = cars12[0];

        for (int p = 0; p < cars12.length; p++) {
            if (cars12[p] % 2 == 1) {
                cars12[p]++;
                System.out.print(cars12[p]);
            } else if (cars12[p] % 2 == 0) {
            System.out.print(cars12[p]);
        }

    }

}
    }

