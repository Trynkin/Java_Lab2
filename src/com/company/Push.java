package com.company;

public class Push implements Command {

    @Override
    public void exec(InitCalc context, String[] argv) {
        if (context.defines.containsKey(argv[1])) {
            context.stack.push(context.defines.get(argv[1]));
        } else {
            context.stack.push(Double.valueOf(argv[1]));
        }
    }
}
