import java.sql.Array;

public class FirstAndLastIndexSortedArrayGivenValue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 4, 4, 7, 8};
        int number = 4;
        int[] result = solution_1(arr, number);
        printArray(result);
    }

    public static int[] solution_1(int[] arr, int number) {
        int[] array = getEmptyArray();

        if (arr.length == 0) {
            return getEmptyArray();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number && array[0] == -1) {
                array[0] = i;
            } else if (arr[i] == number) {
                array[1] = i;
            }
        }
        return array;
    }

    public static int[] getEmptyArray() {
        int[] array = new int[2];
        array[0] = -1;
        array[1] = -1;
        return array;
    }

    public static void printArray(int[] arr) {
        for (int i : arr
        ) {
            System.out.println(i);
        }
    }
}
