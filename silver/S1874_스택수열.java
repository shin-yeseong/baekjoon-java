
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;
import java.io.IOException;

public class S1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        int current = 1;
        boolean isPossible = true;

        for (int j = 0; j < N; j++) {
            int target = arr[j];

            while (current <= target) {
                stack.push(current++);
                sb.append("+ \n");
            }
            if (stack.peek() == target) {
                stack.pop();
                sb.append("- \n");
            } else {
                isPossible = false;
                break;
            }

        }
        if (isPossible) {
            System.out.print(sb);
        } else {
            System.out.print("NO");
        }
    }
}
