package org.subha.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RestController;
import org.subha.messanger.model.Message;
import org.subha.messanger.service.MessageService;

//@RestController
@Path("/Messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
}

