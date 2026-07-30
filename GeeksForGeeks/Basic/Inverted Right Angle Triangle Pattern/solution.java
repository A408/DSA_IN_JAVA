import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i =0;i<n;i++ ){
            
        for(int j =n;j>i;j--){
          System.out.print("*");
        }

        System.out.println();
        }
        

        sc.close();
    }
}