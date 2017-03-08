package org.restapi.test.messenger.resources;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.restapi.test.messenger.model.Message;
import org.restapi.test.messenger.service.MessageService;


@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON) //Consumes JSON
@Produces(MediaType.APPLICATION_JSON) //Produces JSON
public class MessageResource {

	MessageService messageService=new MessageService();
	
	//Get to all messages
	@GET
	public Collection<Message> getMessages(@QueryParam("input") String input){
		if(input.matches(".*[ICM].*"))
			return messageService.getMessage(input);
		return messageService.getAllMessages();
	}
	
	//Get to individual message
	@GET
	@Path("/test")
	public String test(){
		return "test";
	}
	
	//Get to individual message
	@GET
	@Path("/{messageId}")
	public Message getMessageValue(@PathParam("messageId") String messageId){
		return messageService.getMsg(messageId);
	}
	
	@POST
	public Message postMessages(Message message){
		return null;
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") String messageId, Message message){
		message.setId(messageId);
		return null;
	}

	@DELETE
	@Path("/{messageId}")
	public Message deleteMessage(@PathParam("messageId") String messageId){
		return null;
	}
}
