package br.com.paulofernandes.marsapi.services;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	@Autowired
	private MessageSource messageSource;

	public String getMessagem(String key) {
		return this.getMessage(key, null);
	}

	public String getMessagem(String key, String[] args) {
		return this.getMessage(key, args);
	}

	public String getMessage(String key, Object[] args) {
		try {
			return messageSource.getMessage(key, args, new Locale("pt", "BR"));
		} catch (NoSuchMessageException e) {
			return key;
		}
	}

}
