package com.company;

public class Pop implements Command{
    @Override
    public void exec(InitCalc context, String[] argv) {
        context.stack.pop();
    }
}
