
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String nums1;
        String nums2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array (nums1): ");
            nums1 = sc.nextLine();
            System.out.println("Now, enter the array (nums2): ");
            nums2 = sc.nextLine();
        }

        int[] arr = ArrayRearrange(nums1, nums2);
        double result = CalculateMedianValue(arr);

        System.out.println(result);
    }

    public static int[] ArrayRearrange(String nums1, String nums2) {
        int[] aux = NewStringFormat(nums1);
        int[] _aux = NewStringFormat(nums2);

        int[] newArr = new int[aux.length + _aux.length];

        // Merge the two arrays into one.
        System.arraycopy(aux, 0, newArr, 0, aux.length);
        System.arraycopy(_aux, 0, newArr, aux.length, _aux.length);

        MergeSort(newArr, newArr.length);

        return newArr;
    }

    public static void MergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] firstArr = new int[mid];
        int[] secondArr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            firstArr[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            secondArr[i - mid] = arr[i];
        }

        // Recursion
        MergeSort(firstArr, mid);
        MergeSort(secondArr, n - mid);

        Merge(arr, firstArr, secondArr, mid, n - mid);
    }

    public static void Merge(int[] arr, int[] firstArr, int[] secondArr, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (firstArr[i] <= secondArr[j]) {
                arr[k++] = firstArr[i++];
            } else {
                arr[k++] = secondArr[j++];
            }
        }

        while (i < left) {
            arr[k++] = firstArr[i++];
        }

        while (j < right) {
            arr[k++] = secondArr[j++];
        }
    }

    public static double CalculateMedianValue(int[] arr) {
        int aux = 0;

        for(int i = 0; i < arr.length; i++){
            aux += arr[i];
        }
        
        double median = (double)aux/arr.length;

        return median;
    }

    public static int[] NewStringFormat(String num) {
        String[] stringNumbers = num.split(",");
        int[] intArray = new int[stringNumbers.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringNumbers[i].trim());
        }

        return intArray;
    }
}
