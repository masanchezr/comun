package com.atmj.services;

public interface EmailService {
	public void sendSimpleMessage(String to, String subject, String text);
}
