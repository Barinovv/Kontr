package ru.bav.third;

import java.io.IOException;
import java.util.Scanner;

import static ru.bav.third.Third.*;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер окна");
        int window = sc.nextInt();
        String st = reader();
        Double[] array = arr(st, window);
        double mov = moving(window, array);
        double media = median(array);
        System.out.println("Простое скользящее среднее:" + mov);
        System.out.println("Медианный фильтр:" + media);
    }
}
