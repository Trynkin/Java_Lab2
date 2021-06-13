package com.company;

public class Def implements Command {
    @Override
    public void exec(InitCalc context, String[] argv) {
        context.defines.put(argv[1], Double.valueOf(argv[2]));
    }
}