import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array (nums1): ");
        String nums1 = sc.nextLine();

        System.out.println("Now, enter the array (nums2): ");
        String nums2 = sc.nextLine();

        sc.close();

        String[] aux = NewStringFormat(nums1);
        String[] _aux = NewStringFormat(nums2);

        // System.out.println("Nums1: " + aux + "/ Nums2: " + _aux);

        int[] arr = ArrayRearranged(aux);
        int[] _arr = ArrayRearranged(_aux);

        System.out.println(arr);

        return;
    }

    public static int[] ArrayRearranged(String[] nums){
        int[] arr = new int[nums.length];

        for(int i = 0; i < arr.length; i++){
            try{
                arr[i] = Integer.parseInt(nums[i]);
            }catch(NumberFormatException e){
                System.err.println("Error: " + nums[i] + "is not a valid Integer value.");
            }
        }

        return arr;
    }

    public static String[] NewStringFormat(String num){
        String newString = num.replace("[|]", "").toString();
        System.out.println(newString);
        String[] stringNumbers = newString.split(",");

        System.out.println(stringNumbers);

        return stringNumbers;
    }
}