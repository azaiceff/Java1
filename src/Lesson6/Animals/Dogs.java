package Lesson6.Animals;

import java.util.Random;

public class Dogs extends Animals{
    Random random = new Random();
    private static int drownedDogs = 0;
    public static int count;

    public Dogs(String name, String color){
        super(name, color, "Дог");
        count++;
    }

    public static int getDrownedDogs() {return drownedDogs;}

    @Override
    public void swim(int meter) {
        super.swim(meter);
        int maxSwimDistance = getMaxSwimDistance();
        if (meter > maxSwimDistance) {
            System.out.println("Но проплыл " + maxSwimDistance + "м. и утонул");
            drownedDogs++;
        } else {
            System.out.println("Он может проплыть " + maxSwimDistance + "м. и поэтому успешно доплыл!!!");
        }
    }

    @Override
    protected int getMaxRunDistance() {
        return random.nextInt(600) + 10;
    }

    @Override
    protected int getMaxSwimDistance() {
        return random.nextInt(10) + 7;
    }
}
