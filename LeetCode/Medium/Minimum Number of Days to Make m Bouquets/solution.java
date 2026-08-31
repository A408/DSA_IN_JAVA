class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
int min = bloomDay[0];
int max = bloomDay[0];

for (int i = 1; i < bloomDay.length; i++) {

    if (bloomDay[i] < min) {
        min = bloomDay[i];
    }

    if (bloomDay[i] > max) {
        max = bloomDay[i];
    }
}

int l =min;
int r = max;
int ans =-1;
while (l<=r){
    int mid =l+(r-l)/2;
    int c =0;
    int boqt =0;
    for(int i =0;i<bloomDay.length;i++){
        if(bloomDay[i] <= mid){
            c++;
            if(c ==k){
                boqt++;
                c=0;
                  }
        }
        else{
            c=0;

        }
    }
    if(boqt >= m ){
    ans =mid;
    r = mid-1;
}
else {
    l =mid+1;
}
}

  return ans;      
        
    }
}