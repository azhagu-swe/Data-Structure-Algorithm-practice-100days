import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 3, 4, 5, 6 };

        // sorting
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i + 1] + arr[i];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                    isSwapped = true;
                }
            }

        }

        // Alternate sorting
        int[] temp = new int[arr.length];
        int add = 0;
        int even = 1;

        for (int i = 0; i < arr.length / 2; i++) {
            temp[add] = arr[arr.length - 1 - i]; // Place largest elements at odd positions
            add += 2;

            temp[even] = arr[i]; // Place smallest elements at even positions
            even += 2;
        }
        // If the array has an odd number of elements, the middle element will remain
        if (arr.length % 2 != 0) {
            temp[add] = arr[arr.length / 2];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
        arr=alternativeSorting(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static int[] alternativeSorting(int[] arr) {
        int[] temp=new int[arr.length];
       int add=0;
       int even=arr.length-1;
       boolean isFlag=true;
       for(int i=0;i<arr.length;i++){
        temp[i]=isFlag?arr[even--]:arr[add++];
        isFlag=!isFlag;
       }
       return temp;
    
    }

}
