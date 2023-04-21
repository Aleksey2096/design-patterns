package com.example.patterns.behavioral.chain_of_responsibility;

class NegativeProcessor extends Processor {
    public NegativeProcessor(final Processor nextProcessor) {
        super(nextProcessor);

    }

    @Override
    public void process(final Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}