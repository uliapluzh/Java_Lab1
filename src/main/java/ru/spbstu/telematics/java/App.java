package ru.spbstu.telematics.java;

public class App 
{
    public static void main( String[] args ) {}

    public static int[][] sumMatrices(int[][] matrix1, int[][] matrix2)
    {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] resMatrix = new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                resMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resMatrix;
    }

}
