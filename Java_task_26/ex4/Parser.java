package Java_task_26.ex4;

package Java_task_26.ex3.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Pattern;

public class Parser {

    private ArrayList<String > prefix;
    private int creatingStep;

    public Parser(String s){
        prefix = infixToPreFix(s);
    }

    public Double calc(HashMap<String , Double> v){
        creatingStep = 0;
        return createOpers(v).getValue();
    }

    public ArrayList<String> getPrefix() {
        return prefix;
    }

    private Operand createOpers(HashMap<String , Double> v){
        String s = prefix.get(creatingStep++);
        switch (s){
            case "+": return new Add(createOpers(v), createOpers(v));
            case "-": return new Subtract(createOpers(v), createOpers(v));
            case "/": return new Divide(createOpers(v), createOpers(v));
            case "*": return new Multiply(createOpers(v), createOpers(v));
            default:
                if(Pattern.matches("\\d+", s)) return new Const(Double.parseDouble(s));
                else {
                    if(!v.containsKey(s))
                        throw new VariableNotFoundException("Переменной с именем "+s+" не задано значение!");
                    return new Variable(s).toConst(v.get(s));
                }
        }
    }

    private static ArrayList<String> infixToPreFix(String expression){
        ArrayList<String > result = new ArrayList<>();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack<Character> stack = new Stack<Character>();
        char [] charsExp = new String(input).toCharArray();
        for (int i = 0; i < charsExp.length; i++) {
            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            }
            else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }
        for (int i = 0; i < charsExp.length; i++) {
            char c = charsExp[i];
            //check if char is operator or operand
            if (priority(c) > 0) {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                    result.add(stack.pop().toString());
                }
                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result.add(((Character) x).toString());
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                StringBuilder b = new StringBuilder();
                //character is neither operator nor "("
                do{
                    b.append(charsExp[i++]);
                }
                while(i < charsExp.length && "1234567890,".contains(((Character) charsExp[i]).toString()) &&
                        "1234567890,".contains(((Character) charsExp[i-1]).toString()));
                result.add(b.toString());
                i--;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result.add(stack.pop().toString());
        }
        for(int i = 0; i < result.size(); i++){
            result.set(i, new StringBuilder(result.get(i)).reverse().toString());
        }
        for(int i = 0; i < result.size()/2; i++){
            String tmp = result.get(i);
            result.set(i, result.get(result.size()-1-i));
            result.set(result.size()-1-i, tmp);
        }
        result.removeIf(e->Pattern.matches(" +", e));
        return result;
    }

    private static int priority(char operator) {
        switch (operator) {
            case '*' :
            case '/' : return 2;
            case '+' :
            case '-' : return 1;
        }
        return 0;
    }
}
