package exercice6;
import exercice1.*;
import exercice2.*;
import exercice4.MatrixArray;

import javax.print.attribute.standard.Media;

public class MedianArray {
    public static int calculateMedian(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length ; i++) {
            res[i] = exercice1.SortArray.sortIntegers(arr)[i];
        }
        exercice2.ManageArray.reverse(res);
        return res[res.length/2];
    }

    public static void main(String[] args) {
        int[] res = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println(MedianArray.calculateMedian(res));

    }
}
