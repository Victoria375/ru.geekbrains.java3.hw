package FirstHW;

import java.util.Arrays;
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

        Box<Orange> box1Orange = new Box();
        Box<Orange> box2Orange = new Box();
        Box<Apple> box3Apple = new Box();
        Box<Apple> box4Apple = new Box();

        box1Orange.addFruit(new Orange(), 2);
        box2Orange.addFruit(new Orange(), 5);
        box3Apple.addFruit(new Apple(), 0);
        box4Apple.addFruit(new Apple(), 3);

        System.out.println("Вес первой коробки: " + box1Orange.getWeight());
        System.out.println("Вес второй коробки: " + box2Orange.getWeight());
        System.out.println("Вес третьей коробки: " + box3Apple.getWeight());
        System.out.println("Вес четвертой коробки: " + box4Apple.getWeight() + "\n");

        System.out.println("Вес первой и второй коробки совпадает: " + box1Orange.compare(box2Orange));
        System.out.println("Вес первой и четвертой коробки совпадает: " + box1Orange.compare(box4Apple));
        System.out.println("Вес второй и третьей коробки совпадает: " + box2Orange.compare(box3Apple));
        System.out.println("Вес третьей и четвертой коробки совпадает: " + box3Apple.compare(box4Apple) + "\n");

        System.out.println("Пересыпаем яблоки из 4 коробки в 3");
        box4Apple.transferAll(box3Apple);
        System.out.println("Вес третьей коробки: " + box3Apple.getWeight());
        System.out.println("Вес четвертой коробки: " + box4Apple.getWeight());

    }

    private static <T> void swap (T[] arr, int indFirst, int indSecond) {
        T x = arr[indFirst];
        arr[indFirst] = arr[indSecond];
        arr[indSecond] = x;
    }

    private static <T> List <T> transformation (T[] arr) {
        return Arrays.asList(arr);
    }

}
