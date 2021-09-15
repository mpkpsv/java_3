import java.util.Arrays;

public class lesson_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        shiftArrayLeftOrRight(1, arr);

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(i + " - " + arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[100];
        nums[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void createNewArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 3, 16, 50, -10, 0, 7, 99, 1, -5, -15, 100};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            } else if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int[] arr = {20, 3, 16, 50, -10, 0, 7, 99, 1, -5, -15, 100};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void isEqualityOfParts(String arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        public static void main (String[]args){
            int[] arr = {1, 1, 1, 2, 1};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (arr[i] + arr[i + 1] != sum / 2) {
                    arr[i] = arr[i + 1];
                } else {

                    System.out.println("yes");
                }
            }


        }
        public static void shiftArrayLeftOrRight ( int n, int[] arr){
            if (n < 0) {
                n = -n;
            }
            boolean move
            int last = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i + n];
            }
            arr[0] = arr[last] - arr.length;
            System.out.println(n + " " + arr[i]);
        }


    }
}

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
// одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
// длиной len, каждая ячейка которого равна initialValue;
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если
// в массиве есть место, в котором сумма левой и правой части массива равны.
//*** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
// нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
// при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.