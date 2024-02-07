public class Temperature {
    public int index;
    public int value;

    public Temperature(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Stack<Temperature> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.empty()) {
                stack.push(new Temperature(i, temperatures[i]));
            } else {
                while (!stack.empty() && stack.peek().value < temperatures[i]) {
                    result[stack.peek().index] = i - stack.peek().index;
                    stack.pop();
                }
                stack.push(new Temperature(i, temperatures[i]));
            }
        }

        return result;
    }
}
