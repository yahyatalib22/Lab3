package exercice2;


public class ManageArray {
    public static int[] reverse(int[] arr){
        int temp;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }
        for (int i = 0; i <= (Math.floor(res.length/2)); i++){
            temp = res[(res.length - 1) - i];
            res[(res.length - 1) - i] = res[i];
            res[i] = temp;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] array = { 106, 26, 81, 5, 15 };

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        int[] res = ManageArray.reverse(array);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
