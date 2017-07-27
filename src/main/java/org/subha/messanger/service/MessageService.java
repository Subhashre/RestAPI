package org.subha.messanger.service;

import java.util.ArrayList;
import java.util.List;

import org.subha.messanger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L, "Hello Sid", "subha1");
		Message m2 = new Message(2L, "Hello Subha", "subha2");
		Message m3 = new Message(4L, "Hello Neha", "subha3");
		Message m4 = new Message(7L, "Hello Pyasa", "subha4");
		
		List<Message> list= new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		return list;
	}
}
