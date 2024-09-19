package com.example.patterns.behavioral.chain_of_responsibility;

class NegativeProcessor extends Processor {
	public NegativeProcessor(Processor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void process(Number request) {
		if (request.getNumber() < 0) {
			System.out.println("NegativeProcessor : " + request.getNumber());
		} else {
			super.process(request);
		}
	}
}