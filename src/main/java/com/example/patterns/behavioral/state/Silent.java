package com.example.patterns.behavioral.state;

public class Silent implements MobileAlertState {
	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println(" silent... ");
	}
}
