package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static ru.spbstu.telematics.java.App.sumMatrices;

public class AppTest extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void test1_squareMatrices()
    {
        int[][] matrix1 = {
                {2, 5, 1, 4},
                {2, 3, 6, 1},
                {4, 8, 5, 7},
                {1, 3, 4, 5}
        };

        int[][] matrix2 = {
                {4, 2, 8, 3},
                {6, 2, 3, 7},
                {1, 4, 2, 3},
                {5, 6, 3, 6}
        };

        int[][] mustBe = {
                {6, 7, 9, 7},
                {8, 5, 9, 8},
                {5, 12, 7, 10},
                {6, 9, 7, 11}
        };

        int[][] res = sumMatrices(matrix1, matrix2);

        for(int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++)
                assertEquals(res[i][j], mustBe[i][j]);
        }
    }

    public void test2_NotSquareMatrices()
    {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
                };
        int[][] matrix2 = {
                {3, 6, 8},
                {1, 5, 0}
        };

        int[][] mustBe = {
                {4, 8, 11},
                {5, 10, 6}
        };

        int[][] res = sumMatrices(matrix1, matrix2);

        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++)
                assertEquals(res[i][j], mustBe[i][j]);
        }

    }

}
