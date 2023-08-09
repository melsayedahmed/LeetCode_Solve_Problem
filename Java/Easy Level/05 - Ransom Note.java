// Link in Leetcode
// https://leetcode.com/problems/ransom-note/


// (----------------------------- THE ANSWER -----------------------------)


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        
        // Count the frequency of each letter in magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }
        
        // Check if ransomNote can be constructed using letters from magazine
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (freq[index] == 0) {
                return false;
            } else {
                freq[index]--;
            }
        }
        
        return true;
    }
}
