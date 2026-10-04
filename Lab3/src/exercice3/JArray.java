package exercice3;

import exercice2.ManageArray;

public class JArray {
    public static int[][] createJArray(){
        int res[][] = new int[5][];
        int c = 1;
        for (int i=0;i<5;i++){
            res[i] = new int[i+1];
            System.out.println("");
            for (int j=0;j<=i;j++){
                res[i][j] = c;
                System.out.print(res[i][j] + ",");
                c++;
            }
        }
        return res;

    }

    public static void main(String[] args) {

        JArray.createJArray();
    }
}
