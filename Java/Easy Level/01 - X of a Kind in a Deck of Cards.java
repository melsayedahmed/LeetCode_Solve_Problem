// Link in Leetcode
// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/


// (----------------------------- THE ANSWER -----------------------------)


class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : deck) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int gcd = -1;
        for (int frequency : frequencyMap.values()) {
            if (gcd == -1) {
                gcd = frequency;
            } else {
                gcd = getGCD(gcd, frequency);
            }
        }

        return gcd > 1;
    }

    private int getGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return getGCD(b % a, a);
    }
}