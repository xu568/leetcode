public class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c: secret.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                bulls += 1;
                int counter = map.get(guess.charAt(i));
                if (counter > 1) {
                    map.put(guess.charAt(i), counter-1);
                } else {
                    map.remove(guess.charAt(i));
                }    
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != secret.charAt(i) && map.containsKey(guess.charAt(i))) {
                cows += 1;
                int counter = map.get(guess.charAt(i));
                if (counter > 1) {
                    map.put(guess.charAt(i), counter-1);
                } else {
                    map.remove(guess.charAt(i));
                }
            }
        }
        return ""+bulls+"A"+cows+"B";
    }
}