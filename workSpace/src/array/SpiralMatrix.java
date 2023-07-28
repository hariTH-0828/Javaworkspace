package workSpace.src.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;

        while(left < right && top < bottom){

            // get every i in the top row
            for(int i = left; i < right; i++){
                result.add(matrix[top][i]);
            }
            top += 1;

            // get every i in the right col
            for(int i = top; i < bottom; i++){
                result.add(matrix[i][right - 1]);
            }
            right -= 1;

            if (!(left < right && top < bottom)){
                break;
            }

            // get every i in the bottom row
            for (int i = right - 1; i >= left; i--){
                result.add(matrix[bottom - 1][i]);
            }
            bottom -= 1;

            // get every i in the left col
            for(int i = bottom - 1; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left += 1;
        }
        return result;
    }

    public int[][] generateMatrix(int n){
        int[][] matrixData = new int[n][n];
        int left = 0, right = n;
        int top = 0, bottom = n;
        int count = 0;

        while(left < right && top < bottom){

            // get every i in the top row
            for(int i = left; i < right; i++){
                matrixData[top][i] = ++count;
            }
            top += 1;

            // get every i in the right col
            for(int i = top; i < bottom; i++){
                matrixData[i][right - 1] = ++count;
            }
            right -= 1;

            if (!(left < right && top < bottom)){
                break;
            }

            // get every i in the bottom row
            for (int i = right - 1; i >= left; i--){
                matrixData[bottom - 1][i] = ++count;
            }
            bottom -= 1;

            // get every i in the left col
            for(int i = bottom - 1; i >= top; i--){
                matrixData[i][left] = ++count;
            }
            left += 1;
        }

        return matrixData;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        SpiralMatrix spiralMatrix = new SpiralMatrix();

        // Reading n x m matrix value in spiral
        List<Integer> spiralData = spiralMatrix.spiralOrder(array);
        System.out.println(spiralData);

        // Generating spiral n x n matrix
        int[][] generateMatrixData = spiralMatrix.generateMatrix(3);
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(generateMatrixData[i][j] +" ");
            }
            System.out.println();
        }
    }
}
