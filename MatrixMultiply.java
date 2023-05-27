import java.util.Scanner;

public class MatrixMultiply {
    static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    static void mul(int a[][] , int r1 , int c1 , int b[][] , int r2 , int c2){
        if(c1 != r2){
            System.out.println("wrong input :- multiplication is not possible");
            return;
        }
        int mul [][] = new int [r1] [c2];
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c2 ;j++){
                for(int k=0 ; k<c1 ; k++){
                    mul[i][j] += a[i][k] * b[k][j]; 
                }
            }
        }
        printArray(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column of first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int [r1][c1];
        System.out.println("enter the values of first matrix");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the row and column of second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int [r2][c2];
        System.out.println("enter the values of second matrix");
        for(int i=0 ; i<r2 ; i++){
            for(int j=0 ; j<c2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix");
        printArray(a);
        System.out.println();
        System.out.println("second matrix");
        printArray(b);
        System.out.println();
        System.out.println("multiplication of two matrix");
        mul(a, r1, c1, b, r2, c2);
    }
}
