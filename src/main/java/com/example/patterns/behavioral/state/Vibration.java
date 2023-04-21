package com.example.patterns.behavioral.state;

class Vibration implements MobileAlertState {
    @Override
    public void alert(final AlertStateContext ctx) {
        System.out.println(" vibration... ");
    }
}