package com.example.patterns.behavioral.state;

public class Runner {
	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
	}
}
