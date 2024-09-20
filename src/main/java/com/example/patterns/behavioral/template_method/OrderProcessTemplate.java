package com.example.patterns.behavioral.template_method;

public abstract class OrderProcessTemplate {
	public abstract void doSelect();

	public abstract void doPayment();

	public abstract void doDelivery();

	public final void processOrder(boolean isGift) {
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}

	private void giftWrap() {
		try {
			System.out.println("Gift wrap successful");
		} catch (Exception e) {
			System.out.println("Gift wrap unsuccessful");
		}
	}
}
