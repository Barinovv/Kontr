package ru.bav.three;

import java.util.Scanner;

public class Three {

    /**
     * Нахождение ближайшего лифта
     * Чтобы рассчитать ближайший лифт надо к текущему положению лифтов прибавить количество этажей и минимальное число по модулю будет кратчайшим путём.
     */
    public static int[] elevatorUp(int[] floor, int user) {
        int[] arr = new int[4];
        for (int i = 1; i < floor.length; i++) {
            arr[i] = Math.abs(user - floor[i]);
            if (arr[i]<arr[i-1]){
                floor[i] = user;
                System.out.println(floor[i]);
            }
        }
        return floor;
    }
    public static int elevatorDown(int[] floor, int user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужный этаж");
        int max = sc.nextInt();
        int elev = 0;
        for (int i = 0; i < floor.length; i++) {
            if (floor[i] == user) {
                floor[i] = max;
                elev = i;
                break;
            }
        }
        return elev;
    }
    /**
     * На каком этаже нужен лифт
     */
    public static int user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите этаж");
        int floor = sc.nextInt();
        return floor;
    }

    /**
     * 	На каком этаже находится
     * 	(принимаем данные из класса main о этаже где вызван лифт. Получем данные о местоположении лифтов.
     * Вызов лифта на этаж, как только лифт отправляется другой лифт перемещается на первый этаж
     */
    public static int[] floorOne(int user, int[] floor, int elev) {
        //Сравниваем ищем следующий кто не первый отправляем на первый
        int[] arr = new int[4];
        for (int i = 0; i < floor.length; i++) {
            arr[i] = Math.abs(user - floor[i]);
        }
        for (int j = 1;j < floor.length; j++ ){
            if (arr[j] < arr[j - 1] & j != elev) {
                floor[j] = 1;

            }
        }
        return floor;
    }


}
