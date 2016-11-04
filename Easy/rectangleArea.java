public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int intersect = 0;
        if (A >= G || C <= E || D <= F || B >= H) {
            intersect = 0;
        } else {
            int a = Math.min(H, D) - Math.max(F, B);
            int b = Math.min(C, G) - Math.max(A, E);
            intersect = a * b;
        }
        return (C-A)*(D-B) + (G-E)*(H-F) - intersect;
    }
}