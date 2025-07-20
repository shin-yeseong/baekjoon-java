
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;
import java.io.IOException;

public class S9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String value = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVps = true;

            for (int v = 0; v < value.length(); v++) {
                char ch = value.charAt(v);
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty() == true) {
                        isVps = false;
                        break;
                    } else {
                        stack.pop();

                    }
                }
            }

            if (isVps == true && stack.isEmpty()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }

        }
        System.out.print(sb);
    }
}
