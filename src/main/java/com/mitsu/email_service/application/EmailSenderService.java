package com.mitsu.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitsu.email_service.adapters.EmailSenderGateway;
import com.mitsu.email_service.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase{

	private final EmailSenderGateway emailSenderGateway;
	
	@Autowired
	public EmailSenderService(EmailSenderGateway emailGateway) {
		this.emailSenderGateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.emailSenderGateway.sendEmail(to, subject, body);
	}

}
