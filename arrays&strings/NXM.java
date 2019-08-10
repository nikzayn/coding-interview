import java.util.*;

class NXM{

    //Approach - 1
    // Time Complexity: O(n^2)
    // void setZeroes(int[][] matrix){
    //     boolean[] row = new boolean[matrix.length]; 
    //     boolean[] column = new boolean[matrix[0].length];

    //     //Check for rows and columns if they are null or zero
    //     for(int m = 0; m < matrix.length; m++){
    //         for(int n = 0; n < matrix[0].length; n++){
    //             if(matrix[m][n] == 0){
    //                 row[m] = true;
    //                 column[n] = true;
    //             }
    //         }
    //     }

    //     //Check if the rows are null or zero
    //     for(int i = 0; i < row.length; i++){
    //         if(row[i]){
    //             nullRow(matrix, i);
    //         }
    //     }

    //     //Check if the columns are null or zero
    //     for(int j = 0; j < column.length; j++){
    //         if(column[j]){
    //             nullColumn(j, matrix);
    //         }
    //     }
    // }

    // void nullRow(int[][] matrix, int row){
    //     for(int i = 0; i < matrix[0].length; i++){
    //         matrix[row][i] = 0;
    //     }
    // }

    // void nullColumn(int[][] matrix, int column){
    //     for(int j = 0; j < matrix.length; j++){
    //         matrix[j][column] = 0;
    //     }
    // }


    //Approach - 2
    //Time Complexity: O(n) or O(1)

    void setZeroes(int[][] matrix){
        boolean rowHasZero = false;
        boolean colHasZero = false;

        //Check if row has zero
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[j][0] == 0){
                rowHasZero = true;
                break;
            }
        }

        //Check if column has zero
        for(int i = 0; i < matrix.length; i++){
            if(matrix[0][i] == 0){
                colHasZero = true;
                break;
            }
        }

        //Check for the zeroes in the rest of rows and columns
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Nullify rows
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                nullifyRow(matrix, i);
            }
        }

        //Nullify columns
        for(int j = 0; j < matrix.length; j++){
            if(matrix[j][0] == 0){
                nullifyColumns(matrix, j);
            }
        }

        if(rowHasZero){
            nullifyRow(matrix, i);
        }
        if(rowHasColumn){
            nullifyColumns(matrix, j);        
        }
    }
}