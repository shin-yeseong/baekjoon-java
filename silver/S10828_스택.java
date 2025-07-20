
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class S10828_스택 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine()); // 명령어 개수

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int value = Integer.parseInt(command[1]);
                    stack.push(value);
                    break;

                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }

        // 출력
        System.out.print(sb);
    }
}