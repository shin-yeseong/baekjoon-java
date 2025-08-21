import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class S11286_절댓값힙 {

    public static void main(String[] args) throws IOException {

        // 절댓값 기준, 같으면 음수 우선
        PriorityQueue<Integer> absHeap = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if (absA == absB) {
                return a - b; // 절댓값이 같으면 실제 값 비교 (음수 우선)
            } else {
                return absA - absB; // 절댓값 작은 게 우선
            }
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) {
                absHeap.offer(num);
            } else {
                if (absHeap.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(absHeap.poll()).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}