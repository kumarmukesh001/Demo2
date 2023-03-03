package com.copilot.twilio;

public class SmsService {

            private final TwilioConfiguration twilioConfiguration;
            private final SmsSender smsSender;

            public SmsService(TwilioConfiguration twilioConfiguration, SmsSender smsSender) {
                this.twilioConfiguration = twilioConfiguration;
                this.smsSender = smsSender;
            }

            public void sendSms(SmsRequest smsRequest) {
                if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {
                    smsSender.sendSms(smsRequest);
                } else {
                    throw new IllegalArgumentException("Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number");
                }
            }


}
