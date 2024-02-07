class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);

        int result = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")
                    || tokens[i].equals("-")
                    || tokens[i].equals("*")
                    || tokens[i].equals("/")) {
                int y = stack.pop();
                int x = stack.pop();
                if (tokens[i].equals("+"))
                    result = x + y;
                if (tokens[i].equals("-"))
                    result = x - y;
                if (tokens[i].equals("*"))
                    result = x * y;
                if (tokens[i].equals("/"))
                    result = x / y;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return result;
    }
}
