package org.restapi.test.messenger.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.restapi.test.messenger.dao.MessageDao;
import org.restapi.test.messenger.model.Message;

public class MessageService {
	
	MessageDao dao=new MessageDao();
	
	public Collection<Message> getAllMessages(){
		return dao.getAllMessages();
	}
	
	public Collection<Message> getMessage(String messageId){
		return dao.getMessage(messageId);
	}
	
	public Message getMsg(String messageId){
		return dao.getMsg(messageId);
	}

}
