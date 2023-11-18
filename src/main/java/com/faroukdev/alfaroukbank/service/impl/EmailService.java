package com.faroukdev.alfaroukbank.service.impl;

import com.faroukdev.alfaroukbank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
