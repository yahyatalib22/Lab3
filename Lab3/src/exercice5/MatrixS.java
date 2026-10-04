package exercice5;

public class MatrixS {
    public static int[][] matrixSum(int[][] m1,int[][] m2) {
        int res[][] = new int[m1.length][m1.length];
        for (int i=0;i<m1.length;i++){
            for (int j=0;j<m1[i].length;j++){
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }
}
