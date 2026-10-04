package exercice7;

public class IntArray {
    public static double stdev(int[] a){
        if (a == null || a.length <= 1) {
            return 0;
        }
        double avg = 0;
        double res = 0;
        for (int i = 0; i < a.length ; i++) {
            avg = avg + (double) a[i] /(a.length);
        }
        for (int i = 0; i < a.length ; i++) {
            res = res + (a[i] - avg)*(a[i] - avg);
        }
        return Math.pow(res/(a.length -1),0.5);

    }

    public static void main(String[] args){
        int[] arr= {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.print(IntArray.stdev((arr)));
    }
}
