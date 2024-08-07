package firstprogram.com;

public class matrix_addition {
    public static void main(String[] args) {
    int [][] matrix1 = {{1,2,3},
                       {4,5,6}};
    int [][] matrix2 = {{2,6,7},
                        {3,7,1}};
    int [][] result = {{0,0,0},
                         {0,0,0}};
    for(int i = 0; i < matrix1.length; i++)
    {
        for(int j = 0; j < matrix1[i].length; j++)
        {
            System.out.print(matrix1[i][j] + " ");
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }

    }

    }
}

