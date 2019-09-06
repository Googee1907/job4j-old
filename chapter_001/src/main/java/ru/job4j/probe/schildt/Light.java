package ru.job4j.probe.schildt;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;           // приблизительная скорость света, миль в секунду
        days = 1000;                    //указать количество дней
        seconds = days * 24 * 60 * 60;  // преобразовать в секунды
        distance = lightspeed * seconds; // вычислить расстояние
        System.out.print("Зa " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
