package com.copilot.twilio;

import com.twilio.Twilio;

public class TwilioInitializer {

        private TwilioConfiguration twilioConfiguration;

        public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
            this.twilioConfiguration = twilioConfiguration;
        }

        public void initialize() {
            Twilio.init(
                    twilioConfiguration.getAccountSid(),
                    twilioConfiguration.getAuthToken()
            );
        }
}
