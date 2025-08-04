
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class S11279_최대힙 {

    public static void main(String[] args) throws IOException {

        PriorityQueue<Integer> Max = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                Max.offer(num);
            } else if (num == 0) {
                if (Max.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(Max.poll()).append("\n");
                }

            }
        }
        System.out.print(sb);
    }
}
