package algo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        ArrayList<Integer> list = new ArrayList<>();
        Collections.max(list);

        int N = Integer.parseInt(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        boolean decreased = false;
        int sum = arr[0];
        for (int i = 1; i < N; i++) {
            sum += arr[i];
            if (!decreased) {
                if (arr[i - 1] > arr[i]) {
                    decreased = true;
                }
            } else {
                if (arr[i - 1] < arr[i]) {
                    sum = 0;
                    break;
                }
            }
        }

        System.out.print(sum);
    }
}
