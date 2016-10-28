public class Solution {
    public String toHex(int num) {
        String binary = Integer.toBinaryString(num);
        int len = binary.length();
        StringBuilder sb = new StringBuilder();
        int zero = 0;
        if (len % 4 != 0) {
            zero = 4 - len % 4;
        }
        while (zero > 0) {
            binary = "0" + binary;
            zero--;
            len++;
        }
        for (int i = 0; i < len; i += 4) {
            String temp = binary.substring(i, i+4);
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += (temp.charAt(j)-'0')*(1<<(3-j));
            }
            if (sum < 10) {
                sb.append(sum);
            } else {
                switch (sum) {
                    case 10 : 
                        sb.append("a");
                        break;
                    case 11:
                        sb.append("b");
                        break;
                    case 12:
                        sb.append("c");
                        break;
                    case 13:
                        sb.append("d");
                        break;
                    case 14:
                        sb.append("e");
                        break;
                    case 15:
                        sb.append("f");
                        break;
                    default:
                        break;
                }
            }
        }
        return sb.toString();
    }
}