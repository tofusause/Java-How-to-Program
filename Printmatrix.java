package printmatrix;

import java.util.Scanner;
import java.security.SecureRandom;

public class PrintMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int rows, columns,  x=0, o=0;
        
        System.out.print("Enter rows: ");
        rows = input.nextInt();
        System.out.print("Enter columns: ");
        columns = input.nextInt();
        
        int [][] a = new int[rows][columns];
        int total =+ rows*columns;
        for(int i = 0; i < total; i++) {
            int r = rand.nextInt(2);
            if(i % columns == 0) {
                System.out.println("");
            }
            if(r == 1){
                System.out.print("X ");
                 x++;
            }
            if(r == 0) {
                System.out.print("O ");
                o++;
            }
        }
        System.out.println();
        System.out.printf("Number of Xs: %d\n", x);
        System.out.printf("Number of Os: %d\n", o);
    }
    
}
