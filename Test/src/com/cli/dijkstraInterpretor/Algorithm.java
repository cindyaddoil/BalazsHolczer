package com.cli.dijkstraInterpretor;

import java.util.Stack;

public class Algorithm {
	private Stack<String> operatorStack;
	private Stack<Double> valueStack;
	public Algorithm () {
		this.operatorStack = new Stack<>();
		this.valueStack = new Stack<>();
	}
	public void interpreteExpression (String expression) {
		expression = expression.replaceAll(" ", "");
		System.out.println(expression);
		String[] expressionArray = expression.split("");
		for (String s: expressionArray) {
			if (s.equals("(")) {
				//do nth
			} else if (s.equals("+")) {
				operatorStack.push(s);
			} else if (s.equals("-")) {
				operatorStack.push(s);
			} else if (s.equals("*")) {
				operatorStack.push(s);
			} else if (s.equals("/")) {
				operatorStack.push(s);
			} else if (s.equals(")")) {
				String operator = operatorStack.pop();
				if (operator.equals("+")) {
					this.valueStack.push(valueStack.pop()+valueStack.pop());
				} else if (operator.equals("-")) {
					this.valueStack.push(-valueStack.pop()+valueStack.pop());
				} else if (operator.equals("*")) {
					this.valueStack.push(valueStack.pop()*valueStack.pop());
				} else if (operator.equals("/")) {
					this.valueStack.push(1/valueStack.pop()*valueStack.pop());
				} 				
			} else {
				valueStack.push(Double.parseDouble(s));
			}
		}
	}
	public void result(){
		System.out.println(valueStack.pop());
	}
}
