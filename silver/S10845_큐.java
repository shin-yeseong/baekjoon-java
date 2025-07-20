
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class S10845_큐 {

    public static void main(String[] args) throws IOException {

        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int back = -1;
        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":

                    int value = Integer.parseInt(command[1]);
                    q.offer(value);
                    back = value;
                    break;

                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
                    break;
                case "back":
                    if (q.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(back).append("\n");
                    }
                    break;

                default:
                    break;
            }
        }

        System.out.print(sb);
    }
}