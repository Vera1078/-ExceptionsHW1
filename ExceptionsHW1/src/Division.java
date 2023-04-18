//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class Division {

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 4, 32, 9};
        int[] arr2 = {1, 5, 4, 8, 0};


        System.out.println(Arrays.toString(divOf (arr1, arr2)));
        divOf(arr1, arr2);

    }

    public static int[] divOf(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не должен быть равен null!");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов должны быть одинаковыми!");
        }

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Делитель не должен быть равен 0!");
            }
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }
}
