package academy.mate.sort;

public class SortUtils {
    private static int[] arr = new int[1000000];

    public void start() {
        SortUtils sortUtils = new SortUtils();
        sortUtils.bubbleSort(arr);
        sortUtils.shellSort(arr);
        sortUtils.insertionSort(arr);
        sortUtils.quickSort(arr);
        sortUtils.shakeSort(arr);

    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            for (int j = i - 1; j >= 0; j--) {
                int left = arr[j];

                if (num < left) {
                    arr[j + 1] = left;
                    arr[j] = num;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] shellSort(int[] arr) {
        int a = arr.length / 2;
        while (a > 0) {
            for (int i = 0; i < arr.length - a; i++) {
                int j = i;
                while ((j >= 0) && (arr[j] > arr[j + a])) {
                    int temp = arr[j];
                    arr[j] = arr[j + a];
                    arr[j + a] = temp;
                    j--;
                }
            }
            a = a / 2;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int j, temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static int[] quickSort(int[] arr) {
        int index = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            if (arr[i] != arr[index]) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

    public static int[] shakeSort(int[] arr) {
        int left = 1, right = arr.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            right--;
        } while (left <= right);
        return arr;
    }
}
