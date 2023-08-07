// Link in Leetcode
// https://leetcode.com/problems/find-and-replace-pattern/


// (----------------------------- THE ANSWER -----------------------------)


class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (word.length() != pattern.length()) continue;
            Map<Character, Character> map = new HashMap<>();
            boolean isMatch = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                char p = pattern.charAt(i);
                if (!map.containsKey(p) && !map.containsValue(c)) {
                    map.put(p, c);
                } else if (map.containsKey(p) && map.get(p) == c) {
                    continue;
                } else {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) res.add(word);
        }
        return res;
    }
}
