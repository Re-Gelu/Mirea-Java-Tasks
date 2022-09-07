/* Задание на практическую работу №1 
1. Создать проект в IntelliJ IDEA
2. Cоздать собственный Git репозитарий
3. Написать программу, в результате которой считается сумма элементов целочисленного массива с помощью циклов for, while, do while, результат выводится на экран.
4. Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for.
5. Написать программу, в результате работы которой выводятся  на экран первые 10 чисел гармонического ряда (форматировать вывод).
6. Написать программу, в результате которой генерируется массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран (использовать два подхода к генерации случайных чисел – метод random() класса Math и класс Random).
7. Написать программу, которая с помощью метода, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода.
8. Результаты выполнения практической работы залить через IDE в свой репозитарий и продемонстрировать преподавателю. */

package Java_task_1;

import java.util.Arrays;
import java.util.Random;

public class task_1{ 

    public static int get_factorial(int f){
        int factorial_result = 1; 
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }    

    public static void main (String args[]) {

        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("1) Array sum: " + Arrays.stream(array).sum());

        System.out.println("2) Args: " + Arrays.toString(args));

        int num = 10; // number of values we want in a series
        double result = 0.0;
        System.out.print("3) The harmonic series is: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }

        array = new int[(int) (Math.random() * 20)];
        for (int i =0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("\n4) Random array (Math.random): " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("   Sorted random array (Math.random): " + Arrays.toString(array));

        Random random = new Random();
        array = new int[(int) (random.nextInt(20))];
        for (int i =0; i < array.length; i++){
            array[i] = (int) (random.nextInt(100));
        }

        System.out.println("   Random array (Random): " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("   Sorted random array (Random): " + Arrays.toString(array));
        java.util.Scanner in = new java.util.Scanner(System.in, "ibm866");
        System.out.print("5) Input a number: ");
        int f = in.nextInt();
        System.out.print("6) Input a text: ");
        String text = in.next();
        in.close();

        System.out.println("   Text: " + text);

        System.out.println("   Factorial: " + get_factorial(f));
    }
}