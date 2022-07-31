package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        for(;;){
            Scanner sc = new Scanner(System.in);
            char choice;
            do{
                System.out.println("Выберете номер задания: 1 - 8 или q");
                System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. " +
                        "Например: [ 1, 1, 0, 0, 1, 0, 1, 1,0, 0 ].\n" +
                        "С помощью цикла и условия заменить 0 на 1, 1 на 0");
                System.out.println("2. Задать пустой целочисленный массив длиной 100. " +
                        "С помощью цикла заполнить его " +
                        "значениями 1 2 3 4 5 6 7 8 … 100");
                System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] " +
                        "пройти по нему циклом, и числа меньшие 6 " +
                        "умножить на 2");
                System.out.println("""
                        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
                        одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
                        (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
                        диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
                        [0][0],[1][1], [2][2], …, [n][n]""");
                System.out.println("5. Написать метод, принимающий на вход два аргумента: " +
                        "len и initialValue, и возвращающий\nодномерный массив типа int длиной len, " +
                        "каждая ячейка которого равна initialValue");
                System.out.println("6. * Задать одномерный массив " +
                        "и найти в нем минимальный и максимальный элементы");
                System.out.println("""
                        7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
                        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
                        массива равны.""");
                System.out.println("""
                        8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
                        положительным, или отрицательным), при этом метод должен сместить все элементы массива
                        на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
                        вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
                        6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
                        выбирать сами.""");
                choice = sc.next().charAt(0);
            }while(choice < '1' | choice > '8' & choice != 'q');
            if (choice == 'q') break;
            System.out.println("\n");

            switch (choice) {
                case '1' -> {
                    array01();
                    System.out.println("""
                            Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,0, 0 ].
                            С помощью цикла и условия заменить 0 на 1, 1 на 0

                            """);
                    stop();
                }
                case '2' -> {
                    array100();
                    System.out.println("""
                            Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100\s

                            """);
                    stop();
                }
                case '3' -> {
                    arrayX2();
                    System.out.println("""
                            Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

                            """);
                    stop();
                }
                case '4' -> {
                    arrayXXX();
                    System.out.println("""
                            Создать квадратный двумерный целочисленный массив (количество строк и столбцов
                            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
                            (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
                            диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
                            [0][0],[1][1], [2][2], …, [n][n]""");
                    stop();
                }
                case '5' -> {
                    printArraylen();
                    System.out.println("""
                            Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
                            одномерный массив типа int длиной len, каждая ячейка которого равна initialValue

                            """);
                    stop();
                }
                case '6' -> {
                    arrayMinMax();
                    System.out.println("""
                            * Задать одномерный массив и найти в нем минимальный и максимальный элементы

                            """);
                    stop();
                }
                case '7' -> {
                    printArraySum();
                    System.out.println("""
                            ** Написать метод, в который передается не пустой одномерный целочисленный массив,
                            метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
                            массива равны.

                            """);
                    stop();
                }
                case '8' -> {
                    testArrSwap();
                    System.out.println();
                    stop();
                }
            }
        }
    }
    static Random random = new Random();
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0*/
    private static void array01() {
        System.out.println("Задание 1.\nГенерируем массив");
        int leng1 = random.nextInt(6) + 1;
        int leng2 = random.nextInt(21) + 1;
        int[][] array01 = new int[leng1][leng2];
        for(int i = 0; i < leng1; i++) {
            for (int j = 0; j < leng2; j++){
                array01[i][j] = random.nextInt(2);
                System.out.print(array01[i][j]);
            }
            System.out.println();
        }
        System.out.println("Меняем в массиве 0 на 1 и 1 на 0");// и выводим его в консоль
        for(int i = 0; i < leng1; i++) {
            for (int j = 0; j < leng2; j++){
                if(array01[i][j] == 0){
                    array01[i][j] = 1;
                }else {
                    array01[i][j] = 0;
                }
                System.out.print(array01[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
/*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 … 100;*/
    private static void array100() {
        System.out.println("Задание 2.");
        int[][] array100 = new int[3][100];
        for(int i = 0; i < array100.length; i++) {
            for (int j = 0; j < array100[i].length; j++){
                if (j == 51){ // здесь сделал перенос строки, а то не помещается на экран
                    System.out.println();
                }
                array100[i][j] = j + 1;
                System.out.print(array100[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2*/
    private static void arrayX2() {
        System.out.println("Задание 3.");
        /*Немного усложню, генерируем трехмерный массив, делаем подмену и выводим его в консоль
        (подмену уже делал в первом задании, здесь решил пойти немного по другому - загоняю и тут-же
        делаю подмену)*/
        int leng = random.nextInt(6) + 4;
        int [][][] arrayX2 = new int[Math.abs(leng - 6) + 1][leng - 1][leng];
        for(int i = 0; i < arrayX2.length; i++){
            for(int j = 0; j < arrayX2[i].length; j++){
                for(int k = 0; k < arrayX2[i][j].length; k++){
                    arrayX2[i][j][k] = random.nextInt(20);
                    if (arrayX2[i][j][k] <= 6 && arrayX2[i][j][k] != 0){ //в задании не сказано, включительно 6 или нет
                        System.out.print(arrayX2[i][j][k] + "\uD83D\uDE00");
                        //добавляю первоначальное значение и смайлик, чтобы в консоли увидеть,
                        // где произошла подмена числа
                        arrayX2[i][j][k] *= 2;
                    }else if(arrayX2[i][j][k] == 0){//так как при умножении на ноль
                        // мы получим ноль, рядом с ним оставим просто смайлик
                        System.out.print("\uD83D\uDE00");
                    }
                    System.out.print(arrayX2[i][j][k] + " ");
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
    private static void arrayXXX() {
        // трехмерный массив вроде тоже не сложно, попробую выполнить эту задачу в четырехмерном массиве
        System.out.println("Задание 4.");
        int leng = random.nextInt(4) + 10;
        int[][][][] arrayXXX = new int[random.nextInt(2) + 2][random.nextInt(3) + 2][leng][leng];
        System.out.println("\nЭТО ВСЕ ЧЕТЫРЕХМЕРНЫЙ МАССИВ!\n");
        for(int i = 0; i < arrayXXX.length; i++) {
            System.out.println((i + 1) + ". Трехмерный массив\n" );
            for (int j = 0; j < arrayXXX[i].length; j++) {
                System.out.println((j + 1) + ". Двухмерный массив в " + (i + 1) + " трехмерном массиве");
                for (int k = 0; k < arrayXXX[i][j].length; k++) {
                    for (int l = 0; l < arrayXXX[i][j][k].length; l++){
                        //Здесь уже спустились в одномерный массив, пора формировать крестик
                        if (k == l || l == arrayXXX[i][j][k].length - 1 - k){
                            arrayXXX[i][j][k][l] = 1;
                            // Единички не оч. смотрятся, заменю их смайликами
                            System.out.print("\uD83D\uDE00 ");
                        }else {
                            arrayXXX[i][j][k][l] = random.nextInt(90) + 10;
                            // что бы квадратики в консоли были ровными, сгенерировал только двузначные числа
                            System.out.print(arrayXXX[i][j][k][l] + " ");
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
        //Сейчас на практике мне стало очевидно, что каким бы мерным не был массив, он все равно сводится к
        //одномерному и далее к конкретному элементу. Это просто "матрешка". На любом уровне массива мы можем работать
        //как с одномерным массивом.
        System.out.println("Мы получили четырехмерный массив!\n" + "В котором " + arrayXXX.length
        + " трехмерных массива,\nв каждом из которых по " + arrayXXX[arrayXXX.length - 1].length
        + " двухмерных массива.\n" + "Всего двухмерных массивов: "
        + arrayXXX.length * arrayXXX[arrayXXX.length - 1].length + "шт.\n"
        + "В каждом двухмерном по "
        + arrayXXX[arrayXXX.length - 1][arrayXXX[arrayXXX.length - 1].length - 1].length + " одномерных.\n"
        + "Не будем считать сколько одномерных))\nЛадно их всего - "
        + arrayXXX.length
        * arrayXXX[arrayXXX.length - 1].length
        * arrayXXX[arrayXXX.length - 1][arrayXXX[arrayXXX.length - 1].length - 1].length + "шт.))\n");
    }
/*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
одномерный массив типа int длиной len, каждая ячейка которого равна initialValue*/
        //сделаю все же двумерный массив
    private static int[][] arrayLen(int len, int initialValue) {
        int[][] arrayLen = new int[len][len * 5];
        for(int i = 0; i < len; i++){
            for (int j = 0; j < len * 5; j++){
                arrayLen[i][j] = initialValue;
            }
        }return arrayLen;
    }
// Отдельный метод для задания 5. Он генерирует и выводит в консоль полученный массив
    private static void printArraylen() {
        System.out.println("Задание 5.");
        int[][] printarraylen = arrayLen(random.nextInt(5) + 3, random.nextInt(100));
        for (int[] ints : printarraylen) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
/*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
    // пусть будет трехмерный массив
    private static void arrayMinMax() {
        System.out.println("Задание 6");
        int min = 10000000;
        int max = 0;
        int leng = random.nextInt(6) + 5;
        int [][][] arrayMinMax = new int[leng][leng][leng];
        for(int i = 0; i < arrayMinMax.length; i++){
            for(int j = 0; j < arrayMinMax[i].length; j++){
                for(int k = 0; k < arrayMinMax[i][j].length; k++){
                    arrayMinMax[i][j][k] = random.nextInt(9991) + 10;
                    System.out.print(arrayMinMax[i][j][k] + " ");
                    if (arrayMinMax[i][j][k] > max){
                        max = arrayMinMax[i][j][k];
                    }else if (arrayMinMax[i][j][k] < min){
                        min = arrayMinMax[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max = " + max + "\nMin = " + min + "\n");
    }
/*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
массива равны.*/
    /*Тут получается неважно какой мы будем проверять массив, хоть сто мерный.
    Смысл решения все равно останется такой же.
    Для тренировки использую двумерный массив. Сначала создам сам метод для решения, а потом сгенерирую
    массив, которым и проверю метод*/
    private static boolean arraySum(int[] array){
        boolean c = false;
        int a = 0;
        for (int j = 0; j < array.length; j++) {
            int b = 0;
            a += array[j];
            for(int k = array.length - 1; k > j; k--){
                b += array[k];
            }
            if (a - b == 0) {
                System.out.println("\nСумма равна " + a +"\nГраница - " + (j + 1) + "-й элемент");
                c = true;
                System.out.println(Arrays.toString(array));
            }
        }
        return c;
    }
    /*В методе printArraySum() генерирую массив и в нем же запускаю метод arraySumm() для проверки,
    выводя все это дело в консоль*/
    private static void printArraySum() {
        System.out.println("Задание 7.\nЭтот массив мы запускаем на проверку");
        int leng = random.nextInt(5) + 8;
        int[][] printArraySum = new int[100][leng];
        for(int i = 0; i < printArraySum.length; i++){
            System.out.print("Массив № " + (i + 1) + ": ");
            for( int j = 0; j < printArraySum[i].length; j++){
                printArraySum[i][j] = random.nextInt(20);
                System.out.print(printArraySum[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < printArraySum.length; i++) {
            if(arraySum(printArraySum[i])){
                count++;
                System.out.println("Массив № " + (i + 1) + " прошел тест успешно!");
            }
        }
        System.out.println("\nВсего успешно прошло тест " + count + " массивов из 100!");
        System.out.println();
    }
/* *** Написать метод, которому на вход подается одномерный массив и число n (может быть
 положительным, или отрицательным), при этом метод должен сместить все элементы массива
 на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
 вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
 выбирать сами.*/
    private static void arraySwaps(int[] array, int n) {
        if (n > 0){
            for(int i = 0; i < n; i++){
                int k = array[array.length - 1];
                System.arraycopy(array, 0, array, 1, array.length - 1);
                array[0] = k;
            }
        }else {
            for (int i = 0; i > n; i--) {
                int k = array[0];
                System.arraycopy(array, 1, array, 0, array.length - 1);
                array[array.length - 1] = k;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void testArrSwap() {
        System.out.println("Задание 8.\nЭти массивы мы запускаем на проверку");
        int leng = random.nextInt(5) + 8;
        int[][] arr = new int[5][leng];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Массив № " + (i + 1) + ": ");
            for( int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(20);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int n = random.nextInt(5) - 2;
        if (n == 0) {// что бы ноль не генерировался
            n = 1;
        }
        System.out.println("Сместим массивы на " + n);
        for (int[] ints : arr) {
            arraySwaps(ints, n);
        }
    }
    private static void stop(){
        for(;;) {
            Scanner sc = new Scanner(System.in);
            char choice;
            do{
                System.out.println("Нажмите q для выхода в предыдущее меню");
                choice = sc.next().charAt(0);
            }while(choice != 'q');
            break;
        }
    }
}
