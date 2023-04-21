package com.example.patterns.behavioral.chain_of_responsibility;

abstract class Processor {
    private final Processor nextProcessor;

    public Processor(final Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    ;

    public void process(final Number request) {
        if (nextProcessor != null)
            nextProcessor.process(request);
    }

    ;
}