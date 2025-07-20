
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;
import java.io.IOException;

public class S10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                stack.pop();
            } else {
                stack.push(value);

            }
        }
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        System.out.print(sum);
    }
}
