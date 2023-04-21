package com.example.patterns.structural.decorator;

import java.text.DecimalFormat;

public class Runner {
	public static void main(final String[] args) {
		DecimalFormat format = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();

		pizza = new RomaTomatoes(pizza);
		pizza = new RedOnions(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + format.format(pizza.getPrice()));

		pizza = new SimplyNonVegPizza();

		pizza = new RomaTomatoes(pizza);
		pizza = new RedOnions(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + format.format(pizza.getPrice()));
	}
}
