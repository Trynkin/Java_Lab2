package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InitCalc {
    Stack<Double> stack;
    Map<String, Double> defines;

    InitCalc() {
        stack = new Stack<>();
        defines = new HashMap<>();
    }
}
