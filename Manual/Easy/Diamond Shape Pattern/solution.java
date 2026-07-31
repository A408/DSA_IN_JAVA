import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper half
        for (int i=0 ; i<n; i++){
            for (int a=1; a<n-i; a++){
                System.out.print("  ");
            }
            for(int b=0; b<=i; b++){
                System.out.print("* ");
            }
            for(int c=1; c<=i; c++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half
        for (int i=0; i<n-1; i++){
            for (int j=0; j<=i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<n-i-1; k++){
                System.out.print("* ");
            }
            for(int l=0; l<n-i-2; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}