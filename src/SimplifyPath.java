import java.util.Stack;

public class SimplifyPath {

    // https://leetcode.com/problems/simplify-path/
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] actions = path.split("/");
        for (String each : actions) {
            if (!stack.isEmpty() && each.equals("..")) {
                stack.pop();
            } else if (!each.equals(".") && !each.isBlank() && !each.equals("..")) {
                stack.push(each);
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            String element = stack.pop();
            result = "/" + element + result;
        }

        return result.isEmpty() ? "/" : result;
    }

}
