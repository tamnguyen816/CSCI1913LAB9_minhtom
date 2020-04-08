/**
*CSCI 1913 LAB 9
 * Minh Tam H Nguyen
 * Date: 4/8/2020
*/
public class BraceChecker {
    public static boolean checkBraces(String bracesCharacters){
        GenericStack<Character> stack = new GenericStack(1);
        char temp = 'h';

        for(int i = 0; i < bracesCharacters.length(); i++)
        {
            if(bracesCharacters.charAt(i) == '(' || bracesCharacters.charAt(i) == '['
                    || bracesCharacters.charAt(i) == '{'){
                stack.push(bracesCharacters.charAt(i));
            }
            else if(bracesCharacters.charAt(i) == ')' || bracesCharacters.charAt(i) == ']'
                    || bracesCharacters.charAt(i) == '}')
            {
                if(stack.isEmpty()) return false;
                if(bracesCharacters.charAt(i) == ')') temp = '(';
                else if(bracesCharacters.charAt(i) == '}') temp = '{';
                else if(bracesCharacters.charAt(i) == ']') temp = '[';

                if(stack.peek() != temp)
                {
                    return false;
                }
                else{
                    stack.pop();
                }


            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }

}
