package com.company;

public class Print implements Command{
    @Override
    public void exec(InitCalc context, String[] argv) {
        System.out.println(context.stack.peek());
    }
}
