package SixthHW;

import java.util.Arrays;

public class SixthHW {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = new int[]{6, 5, 8, 4, 4};
        int[] arr3 = new int[]{4, 7, 4, 2, 3, 5, 8, 6, 9, 7};

        System.out.println(Arrays.toString(arr1) + " --> " + Arrays.toString(newArrAfterFour(arr1)));
        System.out.println(Arrays.toString(arr2) + " --> " + Arrays.toString(newArrAfterFour(arr2)));
        System.out.println(Arrays.toString(arr3) + " --> " + Arrays.toString(newArrAfterFour(arr3)) + "\n");

        int[] arr4 = new int[]{1, 1, 1, 4, 4, 1, 4, 4, 1, 4};
        int[] arr5 = new int[]{6, 1, 1, 4, 4};
        int[] arr6 = new int[]{4, 4, 4};

        System.out.println(Arrays.toString(arr4) + " --> " + checkArr(arr4));
        System.out.println(Arrays.toString(arr5) + " --> " + checkArr(arr5));
        System.out.println(Arrays.toString(arr6) + " --> " + checkArr(arr6));
    }

    public static int[] newArrAfterFour(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("four not found in array");
    }

    public static boolean checkArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) return false;
        }
        return true;
    }
}