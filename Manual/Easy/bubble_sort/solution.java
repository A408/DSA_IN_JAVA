import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n =5;
      int []arr= {5,4,3,2,1};
      bubbleS(n,arr);
      for(int num:arr){
        System.out.print(num+" ");
      }

    }
    public static void bubbleS(int n, int[] arr) {
      boolean swapped = false;
      for(int i =0;i<n-1;i++){
        for(int j =0;j<n-1-i;j++){
          if (arr[j] >arr[j+1]){
            int temp = arr[j];
             arr[j] = arr[j+1];
            arr[j+1]= temp;
            swapped = true;
          } 
        }
          if(!swapped){
            break;
          }

        }
      }
    

}