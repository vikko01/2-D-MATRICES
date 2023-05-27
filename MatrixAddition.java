import java.util.Scanner;

public class MatrixAddition {
    
    static void printMatrix(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void add(int a[][] ,int r1 , int c1 , int b[][] , int r2 , int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("wrong input :- additon of matrix is not possible");
            return;
        }
        int sum [][] = new int [r1][c1];
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                sum [i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column values of first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int [r1][c1];
        System.out.println("enter the values of first matrix");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the row and column value of second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("enter the values of second matrix");
        for(int i=0 ; i<r2 ; i++){
            for(int j=0 ; j<c2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix");
        printMatrix(a);
        System.out.println();
        System.out.println("second matrix");
        printMatrix(b);
        System.out.println();
         add(a, r1, c1, b, r2, c2);
    }
}
