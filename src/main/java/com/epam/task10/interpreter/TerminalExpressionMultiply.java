package com.epam.task10.interpreter;

public class TerminalExpressionMultiply implements MathExpressionInterpreter {
    @Override
    public void interpret(Context context) {
        Integer firstValue = context.popValue();
        Integer secondValue = context.popValue();
        context.pushValue(firstValue * secondValue);
    }
}
