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

        newArr = MergeSort(newArr);

        return newArr;
    }

    public static int[] MergeSort(int[] arr){
        int[] res = new int[arr.length];

        return res;
    }

    public static double CalculateMedianValue(int[] arr){
        double median = 0.0;

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

    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
