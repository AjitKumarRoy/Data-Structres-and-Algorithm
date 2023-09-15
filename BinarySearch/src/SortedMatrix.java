//Search in Sorted Matrix


import java.util.*;

public class SortedMatrix {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 6;

        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            //find the middle element
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }

            if(matrix[row][mid] < target){
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        //if target not found
        //then return -1,-1
        return new int[] {-1,-1};
    }
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, matrix can be empty
        if(cols == 0){
            return new int[] {-1,-1};
        }
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        //binary search for finding the mid col and two rows
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //run the loop till two rows are remaining
        while (rStart < (rEnd-1)) {//while this is true, it will always have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if (matrix[rEnd][cMid] == target){
            return new int[] {rEnd,cMid};
        }

        //Search in 1st half
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //Search in 2nd half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //search in 3rd half
        if (target <= matrix[rEnd][cMid-1]){
            return binarySearch(matrix,rEnd,0,cMid-1,target);
        } else {
            return binarySearch(matrix,rEnd,cMid+1,cols-1,target);
        }
    }
}
