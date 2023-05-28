import java.util.Scanner;

public class TransposeMatrix {
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method to transpose of matrix with creating a new answer array

    // static int[][] findTranspose(int matrix[][] , int r , int c){
    //     int ans [][] = new int [c][r];

    //     for(int i=0 ; i<c ; i++){
    //         for(int j=0 ; j<r ; j++){
    //             ans[i][j] = matrix[j][i];
    //         }
    //     }
    //     return ans;
    // }

    // method to transpose of matrix without creating a new answer array
    static void findTransposeInplace(int matrix[][] , int r , int c){
        for(int i=0 ; i<c ; i++){
            for(int j=0 ; j<r ; j++){
                //  swap matrix [i][j] to matrix [j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int [r][c];
        System.out.println("enter the" + " " + r*c + " " + "elements of the matrix");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
            printArray(matrix);

            System.out.println("Transpose of a matrix");
            findTransposeInplace(matrix, r, c);
            printArray(matrix);

            // int ans[][] = findTranspose(matrix, r, c);
            // printArray(ans);

    }
}
