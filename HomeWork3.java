package com.company;
     //Вариант 5.
import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {

//Вывести в консоль фигуру, образованную числами: pattern 23
        StringBuilder sb = new StringBuilder("");
        for (int i = 5; i >= 0; i--) {
            String j;
            if (i == 4) {
                j = "1";
                sb = sb.append("1 1 1 1 " + j + "\n");
            }
            if (i == 3) {
                j = "2 2";
                sb = sb.append("1 1 1 " + j + "\n");
            }
            if (i == 2) {
                j = "3 3 3";
                sb = sb.append("1 1 " + j + "\n");
            }
            if (i == 1) {
                j = "4 4 4 4";
                sb = sb.append("1 " + j + "\n");
            }
            if (i == 0) {
                j = "5 5 5 5 5";
                sb = sb.append(j);

                System.out.println(sb);
            }
        }
        System.out.println();

    //5. Заполнить массив случайными неповторяющимися числами в диапазоне [m; n].
    getRandomNumber(10,50);
}
    static void getRandomNumber(int min, int max) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length;) {
            boolean isContains = false;
            int number  = random.nextInt(max - min + 1) + min;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    isContains = true;
                }
            }
            if(!isContains) {
                array[i] = number;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
