import java.util.*;

public class _71_SimplifyPath {

    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) continue;
            if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(part);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}

