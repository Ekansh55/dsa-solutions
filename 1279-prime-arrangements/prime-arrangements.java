class Solution {
    int MOD = 1000000007;

    public long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = (ans * i) % MOD;
        }
        return ans;
    }

    public int numPrimeArrangements(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }

        long primeFact = factorial(primeCount);
        long nonPrimeFact = factorial(n - primeCount);

        return (int) ((primeFact * nonPrimeFact) % MOD);
    }
}