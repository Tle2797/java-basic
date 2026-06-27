
import java.util.Arrays;

public class ArrayAndMethod {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 9, 7};

        System.out.println("Array Langth: " + arr.length);

        System.out.println("Array Element: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] newArr = new int[5];
        Arrays.fill(newArr, 11);
        System.out.println("Filled array: " + Arrays.toString(newArr));

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copyArr));
    }
}
