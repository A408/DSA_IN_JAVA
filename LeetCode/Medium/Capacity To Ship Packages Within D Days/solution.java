class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = weights[0];
        for(int i=0;i<weights.length;i++){
            if(weights[i] > max){
                max = weights[i];
            }
        }
int sum = 0;
for(int i=0;i<weights.length;i++){
    sum+=weights[i];
}

int l = max;   
int r = sum; 
while (l<r) {
    int m = l+(r-l)/2;

  
        int cw =0;
        int rd=1;
        for(int i =0;i<weights.length;i++){
            if(cw + weights[i] <= m){
            cw +=weights[i];
        }
        else {
            cw =weights[i];
            rd++;
        }
        }
        if(rd<=days){
             r = m;
        }
        else {
            l =m+1;
    }   
    }
    return l;
    }
}