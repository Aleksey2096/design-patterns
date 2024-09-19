package com.example.patterns.behavioral.chain_of_responsibility;

public class Chain {
	private Processor chain;

	public Chain() {
		buildChain();
	}

	private void buildChain() {
		chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
	}

	public void process(Number request) {
		chain.process(request);
	}
}