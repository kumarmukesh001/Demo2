package com.copilot.twilio;

import org.springframework.stereotype.Service;

@Service
public class AlertService {

        private final SmsSender smsSender;

        public AlertService(SmsSender smsSender) {
            this.smsSender = smsSender;
        }

        public void sendAlert(String phoneNumber, String message) {
            SmsRequest smsRequest = new SmsRequest(phoneNumber, message);
            smsSender.sendSms(smsRequest);
        }
}
