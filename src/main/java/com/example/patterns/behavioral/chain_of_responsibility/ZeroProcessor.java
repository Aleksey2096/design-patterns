package com.example.patterns.behavioral.chain_of_responsibility;

class ZeroProcessor extends Processor {
	public ZeroProcessor(Processor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public void process(Number request) {
		if (request.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + request.getNumber());
		} else {
			super.process(request);
		}
	}
}