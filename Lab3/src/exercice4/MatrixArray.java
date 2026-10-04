package exercice4;

import exercice3.JArray;

public class MatrixArray {
    public static void copyColumns(int[][] res){
        for (int i=0;i<6;i++){
            res[i][4] = res[i][1];
        }
    }

    public static void main(String[] args) {
        int res[][] = {{0,1,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},};

        MatrixArray.copyColumns(res);

        for (int i=0;i<res.length;i++){
            System.out.println("");
            for (int j=0;j<res[i].length;j++){
                System.out.print(res[i][j] + " ");
            }
        }

    }
}
