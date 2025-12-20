package leetcode.matrix;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = mat.clone();
        if(m*n == r*c) {
            int[] mat1D = get1dMatrix(mat);
            res = get2dMatrix(mat1D, r, c);
        }
        return res;
    }

    public int[] get1dMatrix(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[row*col];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i*col + j] = mat[i][j];
            }
        }
        return res;
    }

    public int[][] get2dMatrix(int[] mat, int row, int col){
        int[][] res = new int[row][col];
        for(int i = 0; i < mat.length; i++){
            res[i/col][i%col] = mat[i];
        }
        return res;
    }
}
