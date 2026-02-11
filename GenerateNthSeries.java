import java.io.*;
import java.util.*;
class UserMainCode {
    public int seriesN(int a, int b, int c, int N) {
        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;
        int gap1 = b - a;
        int gap2 = c - b;
        int current = c;
        for (int i = 4; i <= N; i++) {
            if (i % 2 == 0) {
                current += gap1;
            } else {
                current += gap2;
            }
        }
        return current;
    }
}
