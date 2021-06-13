package com.company;

public class Add implements Command {
    @Override
    public void exec(InitCalc context, String[] argv) {
        context.stack.push(context.stack.pop() + context.stack.pop());
    }
}
