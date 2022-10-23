package ca.javafunblog.collections.stack;

import ca.javafunblog.collections.list.ListUtil;

import java.util.List;
import java.util.Stack;

public class FunWithStack {
    private static void stackFun() {
        Stack<Integer> stack = stack(ListUtil.list(10));
        System.out.println(stack);
        while(!stack.isEmpty()){
            // top element
            Integer pop = stack.pop();
            System.out.println(pop);
        }
        System.out.println(stack.isEmpty());

    }

    // {([])}
    // { ( [ ] ) }
    // { }() => true
    // {(}) => false
    private static boolean stackFunProblem(String paranthesis){
        // peek

        return false;
    }

    private static Stack<Integer> stack(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        list.forEach(stack::push);
        return stack;
    }

    public static void main(String[] args) {
        stackFun();
    }
}
