package by.epam.pia.learning.algorithmization.arraysofarrays;

//9. Задана матрица неотрицательных чисел.
//Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {

    private static final int RANGE = 20;

    public static void main(String[] args) {

        int n;
        int[][] a;

        do {
            n = input("Введите размерность матрицы n(>1)=");
        } while (n < 2);

        a = createSquareMatrix(n);

        System.out.println("Результат работы:");

        int maxSum = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += a[j][i];
            }
            System.out.println("Сумма стобца " + i + " = " + sum);

            if (maxSum < sum) maxSum = sum;
        }

        System.out.println("Максимальная сумма столбца = " + maxSum);
    }

    private static int[][] createSquareMatrix(int n) {
        Random random;
        random = new Random();
        int[][] a;
        a = new int[n][n];
        System.out.println("Инициализация матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(RANGE);
            }
            System.out.println(Arrays.toString(a[i]));
        }
        return a;
    }

    private static int input(String prompt) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
}
