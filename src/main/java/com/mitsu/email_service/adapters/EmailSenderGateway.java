package com.mitsu.email_service.adapters;

public interface EmailSenderGateway {
	
	void sendEmail(String to, String subject, String body);

}
