import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s2.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
            }
              System.out.println();
        }
            
    }
    
}
