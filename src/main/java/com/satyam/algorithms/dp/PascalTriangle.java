package com.satyam.algorithms.dp;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++)
                temp.add(nCr(i,j));
            result.add(temp);
        }
        return result;
    }

    private int nCr(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;

        r = Math.min(r, n - r); // nCr = nC(n-r)
        int result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (n - r + i) / i;
        }

        return result;
    }
}
