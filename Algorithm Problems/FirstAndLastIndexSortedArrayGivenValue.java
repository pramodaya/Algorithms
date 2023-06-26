import java.sql.Array;

public class FirstAndLastIndexSortedArrayGivenValue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 4, 4, 7, 8};
        int number = 4;
        int[] result = solution_1(arr, number);
        printArray(result);
    }

    /**
     * For loop method
     * @param arr
     * @param number
     * @return
     */
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

    /**
     * Binary search method
     * @param arr
     * @param number
     * @return
     */
    public static int[] binarySearchMethod(int[] arr, int number){
        int[] array = getEmptyArray();

        if (arr.length == 0) {
            return getEmptyArray();
        }

        int firstIndex = findFirstIndex(arr, number);
        if (firstIndex == -1) {
            return array;
        }

        int lastIndex = findLastIndex(arr, number);

        array[0] = firstIndex;
        array[1] = lastIndex;

        return array;

    }

    public static int findFirstIndex(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= number) {
                end = mid - 1;
                if (arr[mid] == number) {
                    result = mid;
                }
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static int findLastIndex(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= number) {
                start = mid + 1;
                if (arr[mid] == number) {
                    result = mid;
                }
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
