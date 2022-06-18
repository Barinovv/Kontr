package ru.bav.three;
import java.util.Random;

public class main {
    public static void main(String[] args){
        Random r = new Random();
        int user = Three.user();
        int[] floor = new int[3];
        floor[0] = 1;
        int[] att;
        //размещение лифтов по этажам
        for (int i = 1; i < floor.length; i++) {
            floor[i] = r.nextInt(9) + 1;
        }
        for (int i : floor) {
            System.out.print(i);
        }
        System.out.println();
        //если лифт вызван не на первом, к нему подъезжает ближайший
        //иначе лифт уже есть на первом, выбирается нужный этаж, лифт поднимается, ближайший к первому едет на первый
        if (user!=1){
            att = Three.elevatorUp(floor, user);
            for (int j : att) {
                System.out.print(j);
            }
        } else {
            int elev = Three.elevatorDown(floor, user);
            Three.floorOne(user, floor, elev);
            for (int i : floor) {
                System.out.print(i);
            }
        }


    }
}
