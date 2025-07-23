
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4949_균형잡힌세상 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while (!(line = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int i = 0; i < line.length(); i++) {

                char ch = line.charAt(i);

                if (ch == '(' || ch == '[') {

                    stack.push(ch);
                } else if (ch == ')') {

                    if (stack.isEmpty() || stack.pop() != '(') {

                        isValid = false;
                        break;
                    }

                } else if (ch == ']') {

                    if (stack.isEmpty() || stack.pop() != '[') {
                        isValid = false;
                        break;
                    }
                }

            }
            if (isValid && stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.print(sb);
    }
}
