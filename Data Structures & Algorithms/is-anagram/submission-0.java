
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charMap1 = new HashMap<>();
        for (char c: s.toCharArray()) {
            charMap1.merge(c, 1, Integer::sum);
        }
      

        Map<Character, Integer> charMap2 = new HashMap<>();
        for (char c: t.toCharArray()) {
            charMap2.merge(c, 1, Integer::sum);
        }

       return charMap1.equals(charMap2);

    }
}
