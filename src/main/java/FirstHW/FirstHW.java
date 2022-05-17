package FirstHW;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FirstHW {
    public static void main(String[] args) {

        // Task 1

        String[] arr = {"a", "b", "c", "d", "e"};
        System.out.println(Arrays.toString(arr));
        swap(arr, 3, 1);
        System.out.println(Arrays.toString(arr) + "\n");

        // Task 2

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array) + " " + array.getClass());
        List<Integer> arrayList = transformation(array);
        System.out.println(arrayList + " " + arrayList.getClass() + "\n");

        // Task 3

        Box<Orange> Box1Orange = new Box();
        Box<Orange> Box2Orange = new Box();
        Box<Apple> Box3Apple = new Box();
        Box<Apple> Box4Apple = new Box();

        Box1Orange.addFruit(new Orange(), 2);
        Box2Orange.addFruit(new Orange(), 5);
        Box3Apple.addFruit(new Apple(), 0);
        Box4Apple.addFruit(new Apple(), 3);

        System.out.println("Вес первой коробки: " + Box1Orange.getWeight());
        System.out.println("Вес второй коробки: " + Box2Orange.getWeight());
        System.out.println("Вес третьей коробки: " + Box3Apple.getWeight());
        System.out.println("Вес четвертой коробки: " + Box4Apple.getWeight() + "\n");

        System.out.println("Вес первой и второй коробки совпадает: " + Box1Orange.compare(Box2Orange));
        System.out.println("Вес первой и четвертой коробки совпадает: " + Box1Orange.compare(Box4Apple));
        System.out.println("Вес второй и третьей коробки совпадает: " + Box2Orange.compare(Box3Apple));
        System.out.println("Вес третьей и четвертой коробки совпадает: " + Box3Apple.compare(Box4Apple));

    }

    private static <T> void swap (T[] arr, int indFirst, int indSecond) {
        T x = arr[indFirst];
        arr[indFirst] = arr[indSecond];
        arr[indSecond] = x;
    }

    private static <T> List <T> transformation (T[] arr) {
//        ArrayList<T> arrayList = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            arrayList[i] = arr[i];
//        }
//        return arrayList;
        return Arrays.asList(arr);
    }

}
