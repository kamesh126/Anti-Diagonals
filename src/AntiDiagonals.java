import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AntiDiagonals {



            public static void Antidiagonal(int A[][],int n)
            {

                for (int x = 0; x < n; x++) {
                    int i = x, j= 0;
                    while (i >= 0 && j< n) {
                        System.out.print(A[j][i]);
                        i--;
                        j++;

                    }
                    System.out.println();

                }
                for (int y= 1; y< n; y++) {
                    int i=y, j= n - 1;

                    while (i< n && j>= 0) {
                        System.out.print(A[i][j]);
                        j--;
                        i++;
                    }

                }
                System.out.println();


            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[][]=new int[n][n];
                for(int i=0;i<n;i++) {
                    for(int j=0;j<n;j++) {
                        arr[i][j]=sc.nextInt();
                    }
                }
                Antidiagonal(arr,n);





            }
        }

