package workSpace.src.searching;

public class Search2DArray {

    public boolean searchMatrix(int[][] matrix, int target){
        int row = matrix.length;
        int column = matrix[0].length;
        int i = 0;

        if(row > 1){
            for(i = 0; i < row; i++){
                if(target <= matrix[i][column - 1]){
                    break;
                }
            }
        }

        int lb = 0; int hb = column - 1;
        while(lb <= hb){
            int pos = (lb + hb) / 2;
            if(target == matrix[i][pos]){
                return true;
            }else if(target < matrix[i][pos]){
                hb = pos - 1;
            }else {
                lb = pos + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1}};
        System.out.println(new Search2DArray().searchMatrix(matrix, 2));
    }
}
