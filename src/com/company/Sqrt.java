package com.company;

import static java.lang.Math.sqrt;

public class Sqrt implements Command{
    @Override
    public void exec(InitCalc context, String[] argv) {
        context.stack.push(sqrt(context.stack.pop()));
    }
}
