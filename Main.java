import java.util.Scanner;

import static java.lang.System.*;

class House {
    String adress;
    int floor;
    int krooms;
    float area;

    House(String adress, int floor, int krooms, float area) {
        this.adress = adress;
        this.floor = floor;
        this.krooms = krooms;
        this.area = area;
    }

    public void flat() {
        out.printf("Адрес: %S, этаж: %d, кол-во комнат: %d, площадь: %f \n", this.adress, this.floor, this.krooms, this.area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите количество квартир: ");
        int n = in.nextInt();
        House[] dom = new House[n];
        for (int i = 0; i < n; i++) {
            out.print("Введите адрес: ");
            String ad = in.next();
            out.print("Введите этаж: ");
            int fl = in.nextInt();
            out.print("Введите кол-во комнат: ");
            int kr = in.nextInt();
            out.print("Введите площадь: ");
            float ar = in.nextFloat();
            dom[i] = new House(ad, fl, kr, ar);
        }
        out.print("Введите число комнат для вывода соответствующих квартир: ");
        int r = in.nextInt();
        flats(dom, r);
        out.println("Введите число комнат и этаж для вывода соответствующих квартир");
        out.print("количество комнат: ");
        int k1 = in.nextInt();
        out.print("Этаж: ");
        int f = in.nextInt();
        flats(dom, k1, f);
        out.print("Введите площадь для вывода квартир, площадь которых её превосходит: ");
        float a = in.nextFloat();
        areaFlats(dom, a);
    }
    public static void flats(House[] dom, int... k){
        int count = 0;
        if (k.length == 1){
            for (House i : dom) {
                if (i.krooms == k[0]) {
                    i.flat();
                    count++;
                }
            }
        }
        else if(k.length == 2){
            for (House i : dom) {
                if (i.krooms == k[0] & i.floor == k[1]) {
                    i.flat();
                    count++;
                }
            }
        }
        if (count == 0)
            out.println("Квартир подходящих под данные критерии нет ");
    }
    public static void areaFlats(House[] dom, float ar){
        int count = 0;
        for (House i : dom) {
            if (i.area > ar) {
                i.flat();
                count++;
            }
        }
        if (count == 0)
            out.println("Квартир подходящих под данные критерии нет ");
    }
}