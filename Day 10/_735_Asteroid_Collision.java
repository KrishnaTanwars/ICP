import java.util.*;
public class _735_Asteroid_Collision {
    

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Handle potential collision
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                if (top < -asteroid) {
                    stack.pop(); // top asteroid explodes
                } else if (top == -asteroid) {
                    stack.pop(); // both explode
                    asteroid = 0; // mark as exploded
                } else {
                    asteroid = 0; // incoming asteroid explodes
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}

}
