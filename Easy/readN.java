/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int counter = 0;
        while (n > 4) {
          char[] temp = new char[4];
          int r = read4(temp);
          for (int i = 0; i < r; i++) {
            buf[counter++] = temp[i];
          }
          if (r < 4) break;
          n -= 4;
        }
        char[] temp = new char[4];
        int r = read4(temp);
        for (int i = 0; i < r && i < n; i++) {
          buf[counter++] = temp[i];
        }
        return counter;
    }
}