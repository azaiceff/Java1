package Lesson3;

//import java.util.Arrays;
import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {
    mass01();
    mass100();
    massX2();
    massXXX();
    printMasslen();
    massMinMax();


    }
    static Random random = new Random();
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0*/
    private static void mass01() {
        /*с одномерным массивом все ясно, буду пробовать двухмерный.
        Сгенерирую двухмерный массив и выводим его в консоль*/
        System.out.println("Задание 1.\nГенерируем массив");
        int leng1 = random.nextInt(6) + 1;
        int leng2 = random.nextInt(21) + 1;
        int[][] mass01 = new int[leng1][leng2];
        for(int i = 0; i < leng1; i++) {
            for (int j = 0; j < leng2; j++){
                mass01[i][j] = random.nextInt(2);
                System.out.print(mass01[i][j]);
            }
            System.out.println();
        }
        System.out.println("Меняем в массиве 0 на 1 и 1 на 0");// и выводим его в консоль
        for(int i = 0; i < leng1; i++) {
            for (int j = 0; j < leng2; j++){
                if(mass01[i][j] == 0){
                    mass01[i][j] = 1;
                }else {
                    mass01[i][j] = 0;
                }
                System.out.print(mass01[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
/*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 … 100;*/
    private static void mass100() {
        System.out.println("Задание 2.");
        int[][] mass100 = new int[3][100];
        for(int i = 0; i < mass100.length; i++) {
            int a = 0;
            for (int j = 0; j < mass100[i].length; j++){
                if (j == 51){ // здесь сделал перенос строки, а то не помещается на экран
                    System.out.println();
                }
                mass100[i][j] = a + 1;
                System.out.print(mass100[i][j] + " ");
                a += 1;
            }
            System.out.println("\n");// разделил строки массива для наглядности
        }
    }
/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2*/
    private static void massX2() {
        System.out.println("Задание 3.");
        /*Немного усложню, генерируем трехмерный массив, делаем подмену и выводим его в консоль
        (подмену уже делал в первом задании, здесь решил пойти немного по другому - загоняю и тут-же
        делаю подмену)*/
        int leng = random.nextInt(6) + 4;
        int [][][] massX2 = new int[Math.abs(leng - 6) + 1][leng - 1][leng];
        //[Math.abs(leng - 6) + 1] здесь я мог получить отрицательное число, поэтому модуль.
        // Так же мог получить ноль, поэтому +1
        for(int i = 0; i < massX2.length; i++){
            for(int j = 0; j < massX2[i].length; j++){
                for(int k = 0; k < massX2[i][j].length; k++){
                    massX2[i][j][k] = random.nextInt(20);
                    if (massX2[i][j][k] <= 6 && massX2[i][j][k] != 0){ //в задании не сказано, включительно 6 или нет
                        System.out.print(massX2[i][j][k] + "\uD83D\uDE00");
                        //добавляю первоначальное значение и смайлик, чтобы в консоли увидеть,
                        // где произошла подмена числа
                        massX2[i][j][k] *= 2;
                    }else if(massX2[i][j][k] == 0){//так как при умножении на ноль
                        // мы получим ноль, рядом с ним оставим просто смайлик
                        System.out.print("\uD83D\uDE00");
                    }
                    System.out.print(massX2[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
[1][1], [2][2], …, [n][n]*/
    private static void massXXX() {
        // трехмерный массив вроде тоже не сложно, попробую выполнить эту задачу в четырехмерном массиве
        System.out.println("Задание 4.");
        int leng = random.nextInt(4) + 10;
        int[][][][] massXXX = new int[random.nextInt(2) + 2][random.nextInt(3) + 2][leng][leng];
        System.out.println("\nЭТО ВСЕ ЧЕТЫРЕХМЕРНЫЙ МАССИВ!\n");
        for(int i = 0; i < massXXX.length; i++) {
            System.out.println((i + 1) + ". Трехмерный массив\n" );
            for (int j = 0; j < massXXX[i].length; j++) {
                System.out.println((j + 1) + ". Двухмерный массив в " + (i + 1) + " трехмерном массиве");
                for (int k = 0; k < massXXX[i][j].length; k++) {
                    for (int l = 0; l < massXXX[i][j][k].length; l++){
                        //Здесь уже спустились в одномерный массив, пора формировать крестик
                        if (k == l || l == massXXX[i][j][k].length - 1 - k){
                            massXXX[i][j][k][l] = 1;
                            // Единички не оч. смотрятся, заменю их смайликами
                            System.out.print("\uD83D\uDE00 ");
                        }else {
                            massXXX[i][j][k][l] = random.nextInt(90) + 10;
                            // что бы квадратики в консоли были ровными, сгенерировал только двузначные числа
                            System.out.print(massXXX[i][j][k][l] + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        //Сделаем выводы. Четырехмерный массив уже интереснее, но пяти мерный делать уже не хочется
        // (можно конечно попробовать, но ...)
        System.out.println("Мы получили четырехмерный массив!\n" + "В котором " + massXXX.length
        + " трехмерных массива,\nв каждом из которых по " + massXXX[massXXX.length - 1].length
        + " двухмерных массива.\n" + "Всего двухмерных массивов: "
        + massXXX.length * massXXX[massXXX.length - 1].length + "шт.\n"
        + "В каждом двухмерном по "
        + massXXX[massXXX.length - 1][massXXX[massXXX.length - 1].length - 1].length + " одномерных.\n"
        + "Давайте не будем считать сколько одномерных))\nЛадно их всего - "
        + massXXX.length
        * massXXX[massXXX.length - 1].length
        * massXXX[massXXX.length - 1][massXXX[massXXX.length - 1].length - 1].length + "шт.))\n");
    }
/*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
одномерный массив типа int длиной len, каждая ячейка которого равна initialValue*/
        //сделаю все же двумерный массив
    private static int[][] massLen(int len, int initialValue) {
        int[][] massLen = new int[len][len * 5];
        for(int i = 0; i < len; i++){
            for (int j = 0; j < len * 5; j++){
                massLen[i][j] = initialValue;
            }
        }return massLen;
    }
// Отдельный метод для задания 5. Он генерирует и выводит в консоль полученный массив
    private static void printMasslen() {
        System.out.println("Задание 5.");
        int[][] printMasslen = massLen(random.nextInt(5) + 3, random.nextInt(100));
        for (int[] ints : printMasslen) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
/*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
    // пусть будет трехмерный массив
    private static void massMinMax() {
        System.out.println("Задание 6");
        int min = 10000000;
        int max = 0;
        int leng = random.nextInt(6) + 5;
        int [][][] massMinMax = new int[leng][leng][leng];
        for(int i = 0; i < massMinMax.length; i++){
            for(int j = 0; j < massMinMax[i].length; j++){
                for(int k = 0; k < massMinMax[i][j].length; k++){
                    massMinMax[i][j][k] = random.nextInt(10000) + 10;
                    System.out.print(massMinMax[i][j][k] + " ");
                    if (massMinMax[i][j][k] > max){
                        max = massMinMax[i][j][k];
                    }else if (massMinMax[i][j][k] < min){
                        min = massMinMax[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max = " + max + "\nMin = " + min);
    }
/*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
массива равны.*/
/* *** Написать метод, которому на вход подается одномерный массив и число n (может быть
 положительным, или отрицательным), при этом метод должен сместить все элементы массива
 на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
 вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
 выбирать сами.*/



}
