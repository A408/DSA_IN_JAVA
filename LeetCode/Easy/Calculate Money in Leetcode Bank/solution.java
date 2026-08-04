class Solution {
    public int totalMoney(int n) {
        int ttl = 0;
        int monday = 1;
        int crt = 1;

        for (int i = 1; i <= n; i++) {
            ttl += crt;
            crt++;

            if (i % 7 == 0) {
                monday++;
                crt = monday;
            }
        }

        return ttl;
    }
}