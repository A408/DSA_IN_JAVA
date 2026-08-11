class Solution {
    public void duplicateZeros(int[] arr) {
        
        int zeroCount = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 0) {
        zeroCount++;
    }
}
            
        int i = arr.length - 1;
int j = arr.length - 1 + zeroCount;
while (i >= 0) {

    if (arr[i] == 0) {

        if (j < arr.length) {
            arr[j] = 0;
        }
        j--;

        if (j < arr.length) {
            arr[j] = 0;
        }
        j--;

    } else {

        if (j < arr.length) {
            arr[j] = arr[i];
        }
        j--;
    }

    i--;
}
        
    }
}