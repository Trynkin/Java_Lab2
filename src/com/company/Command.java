package com.company;

public interface Command {
    void exec(InitCalc context, String[] argv);
}
