import java.util.Arrays;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Difference {
    public static void main (String[] atgs) {
        int[] arr1 = {7, 9, 3, 5, 4, 0};
        int[] arr2 = {1, 2, 6, 8, 3, 7};

        System.out.println(Arrays.toString(difOf (arr1, arr2)));
        difOf(arr1, arr2);
    }

    private static int[] difOf(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Массив не должен быть равен null!");
        }

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов должны быть одинаковыми");
        }

        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3 [i] = arr1[i] - arr2[i];
        }
        return arr3;
    }

}
