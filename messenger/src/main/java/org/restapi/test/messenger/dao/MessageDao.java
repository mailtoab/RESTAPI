package org.restapi.test.messenger.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.restapi.test.messenger.model.Message;

public class MessageDao {
	
	HashMap<String,Message> map=new HashMap<String,Message>();
	
	public MessageDao(){
		Message m1=new Message("1","Hello World","Abdul");
		Message m2=new Message("2","Hello Jersey","Basith");
		map.put("1", m1);
		map.put("2", m2);
	}
	public Collection<Message> getAllMessages(){		
		return map.values();
	}
	
	public Collection<Message> getMessage(String messageId){
		List<Message> list=new ArrayList<Message>();
		list.add(map.get(messageId));
		return list;
	}
	
	public Message getMsg(String messageId){
		return map.get(messageId);
	}

}
