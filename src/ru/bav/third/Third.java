package ru.bav.third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Third {
    private static final String IN_FILE_TXT = "src\\inFile.txt";

    //чтение из файла
    public static String reader() throws IOException {
        String st;
        BufferedReader reader = new BufferedReader(new FileReader(IN_FILE_TXT));
        st = reader.readLine();
        reader.close();
        return st;
    }

    //Происходит запись строки как массива
    public static Double[] arr(String st, int window){
        String[] words = st.split(", ");
        String[] mini = new String[window];
        System.arraycopy(words, 0, mini, 0, window);
        Double[] array = Stream.of(mini).mapToDouble(Double::parseDouble).boxed().toArray(Double[]::new);
        return array;
    }

    //считает среднее
    public static Double moving(int window, Double[] arr){
        double simpleMovingAverage = 0;
        for (Double array : arr){
            simpleMovingAverage+=array;
        }
        simpleMovingAverage = simpleMovingAverage/window;
        return simpleMovingAverage;
    }

    //медианный фильтр
    public static double median(Double[] array) {
        Arrays.sort(array);
        double media = 0;
         array[0] = 0.0;
         array[array.length-1] = 0.0;
         for (Double aDouble : array) {
         media = media + aDouble;
         }
         return media/array.length;
    }


}
