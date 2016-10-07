package org.usc.edu;

public class Reverse {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + Long.valueOf( x % 10 );
            x = x / 10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        return (int) res;
    }
}