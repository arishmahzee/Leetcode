class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Integer, Character> lettersAvailable = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lettersAvailable.put(i, s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);

            boolean found = false;

            for (Map.Entry<Integer, Character> entry : lettersAvailable.entrySet()) {
                if (entry.getValue() == letter) {
                    lettersAvailable.remove(entry.getKey());
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}