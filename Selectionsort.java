import java.util.Scanner;

public class print25 {

     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=0;
        int j=0;
        int D=0;
        int A[][]= new int[3][3];
        int B[][]=new int [3][3];
        int C[][]=new int [3][3];
        for (i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j]=s.nextInt();
            }
            
        }for (i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j]=s.nextInt();
            }

     }for (i=0;i<3;i++){
        for(j=0;j<3;j++){
            C[i][j]=A[i][j]*B[i][j];
        }

 }System.out.println(C);System.out.println("Result of A * B:");
 for ( i = 0; i < 3; i++) {
     for ( j = 0; j < 3; j++) {
         System.out.print(C[i][j] + "\t");
     }
     System.out.println();
 }for(i=0;i<3;i++){
    for (j=0;j<3;j++){
        D=D+C[i][j];
    }
 }System.out.println(D);
}
}
