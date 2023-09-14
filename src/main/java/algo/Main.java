package algo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int ans = 0;

        ans += N / 14;
        N %= 14;

        ans += N / 7;
        N %= 7;

        ans += N / 1;

        System.out.println(ans);
    }
}
