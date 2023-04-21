package com.example.patterns.behavioral.state;

class Silent implements MobileAlertState {
    @Override
    public void alert(final AlertStateContext ctx) {
        System.out.println(" silent... ");
    }
}