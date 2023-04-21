package com.example.patterns.behavioral.chain_of_responsibility;

class PositiveProcessor extends Processor {
    public PositiveProcessor(final Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(final Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}