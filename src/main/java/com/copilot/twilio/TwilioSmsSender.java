package com.copilot.twilio;

public class TwilioSmsSender implements SmsSender {

    @Override
    public void sendSms(SmsRequest smsRequest) {
        if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {
            Message.creator(
                    new PhoneNumber(smsRequest.getPhoneNumber()),
                    new PhoneNumber("+12058561234"),
                    smsRequest.getMessage()
            ).create();
        } else {
            throw new IllegalArgumentException("Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number");
        }
    }



    private boolean isPhoneNumberValid(String phoneNumber) {
}
