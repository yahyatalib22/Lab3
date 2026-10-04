package exercice1;


public class SortArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int res[] = new int[arr.length];
        int temp;
        for (int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if (res[j] >= res[j-1]) {
                    temp = res[j];
                    res[j] = res[j-1];
                    res[j-1] = temp;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        // 1. Create a test array of integers
        int[] originalArray = { 106, 26, 81, 5, 15 };

        SortArray.printArray(originalArray);

        // 2. Call the sortIntegers method
        int[] sortedArray = SortArray.sortIntegers(originalArray);

        SortArray.printArray(sortedArray);

        SortArray.printArray(originalArray);
    }
}
