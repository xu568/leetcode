public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

// n = 1    win
// n = 2    win
// n = 3    win
// n = 4    lose
// n = 5    win, remove one becomes n = 4 for opponent
// n = 6    win, remove two becomes n = 4 for opponent
// n = 7    win, remove three becomes n = 4 for opponent
// n = 8    lose, since no matter how much being removed, opponent make it four.
// n = 9    win, remove one make it n = 8 for opponent.
// ....
// lose when n % 4 == 0
