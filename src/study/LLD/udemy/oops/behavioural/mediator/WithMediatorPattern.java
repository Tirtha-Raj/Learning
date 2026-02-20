package study.LLD.udemy.oops.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class WithMediatorPattern {
	public static void main(String[] args) {

		ChatRoom ramayanChat = new ChatRoom();
		ChatUser ram = new ChatUser("Ram");
		ChatUser lakshman = new ChatUser("Lakshman");
		ChatUser sita = new ChatUser("Sita");

		ramayanChat.addUser(ram);
		ramayanChat.addUser(lakshman);
		ramayanChat.addUser(sita);

		ramayanChat.sendMessage("Need help", sita);
		ramayanChat.sendMessage("we are coming", ram);

		ChatUser dasaratha = new ChatUser("Dasaratha");
		ramayanChat.addUser(dasaratha);

		ramayanChat.sendMessage("Vijayee bhava", dasaratha);

	}
}

interface ChatMediator {
	void sendMessage(String msg, ChatUser user);

	void addUser(ChatUser user);
}

class ChatRoom implements ChatMediator {
	private List<ChatUser> users;

	public ChatRoom() {
		users = new ArrayList<ChatUser>();
	}

	@Override
	public void sendMessage(String msg, ChatUser sender) {
		for (ChatUser user : users) {
			if (user != sender) {
				System.out.println(sender.getName() + " sending message : " + msg + " : to " + user.getName());
			}

		}
	}

	@Override
	public void addUser(ChatUser user) {
		users.add(user);

	}
}

class ChatUser {
	private String name;

	public ChatUser(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}