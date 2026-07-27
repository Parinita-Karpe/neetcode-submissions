class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(!tokens[i].equals("+") &&  !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/"))
            {
                stack.push(Integer.valueOf(tokens[i]));
            }
            else
            {
                int a=stack.pop();
                int b=stack.pop();
                // if(stack.pop().pop().isEmpty())break;
                if(tokens[i].equals("+"))
                {
                    int temp=a+b;
                    
                    stack.push(temp);
                }
                else if(tokens[i].equals("-"))
                {
                    int temp=b-a;
                    
                    stack.push(temp);
                }
                else if(tokens[i].equals("*"))
                {
                    int temp=a*b;
                   
                    stack.push(temp);
                }
                else
                {
                    int temp=b/a;
                    stack.push(temp);
                }
            }
        }
        return stack.pop();
    }
}
