package algo;

import java.io.*;
import java.util.*;

/*
https://velog.io/@sckwon770/%EB%B2%A8%EB%A7%8C-%ED%8F%AC%EB%93%9C-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Java
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] participant = new String[]{"a"};
        String[] completion = new String[]{"a"};
        Map<String, Integer> hm = new HashMap<>();
        hm.getOrDefault()
        for (String c : completion) {
            if (hm.containsKey(c)) hm.put(c, hm.get(c) + 1);
            else hm.put(c, 0);
        }

        String answer = "";

        for (String p : participant) {
            if (!hm.containsKey(p) || hm.get(p) == 0) answer = p;
            hm.put(p, hm.get(p) - 1);
        }
    }
}
