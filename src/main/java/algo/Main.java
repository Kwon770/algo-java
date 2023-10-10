package algo;

import java.io.*;
import java.util.*;

/*
https://velog.io/@sckwon770/%EB%B2%A8%EB%A7%8C-%ED%8F%AC%EB%93%9C-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Java
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = NM[0];
        int M = NM[1];
        long[] dist = new long[N];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        int[][] buses = new int[M][3];
        for (int i = 0; i < M; i++) {
            int[] abc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            buses[i] = new int[]{abc[0] - 1, abc[1] - 1, abc[2]};
        }

        boolean cycled = false;
        for (int i = 0; i < N; i++) {
            for (int[] bus : buses) {
                int src = bus[0];
                int dest = bus[1];
                int cost = bus[2];
                if (dist[src] == Long.MAX_VALUE || dist[dest] <= dist[src] + cost) continue;

                dist[dest] = dist[src] + cost;

                if (i == N - 1) cycled = true;
            }
        }

        if (cycled) System.out.println(-1);
        else {
            for (int i = 1; i < N; i++) {
                if (dist[i] == Long.MAX_VALUE) System.out.println(-1);
                else System.out.println(dist[i]);
            }
        }
    }
}
