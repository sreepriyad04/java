package designpatterns.builder.MessageProblem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageBuilder builder = new MessageBuilder();
		builder.setMessageType(MessageType.TEXT);
		builder.setDelivered(true);
		builder.setRecipient("recipientAddress");
	//	Message message = new Message(builder);
		builder.build(); // return Message object
		System.out.println(builder.build().getMessageType());
		
		Message message = Message.getBuilder()  // this means creating immutable object, above way there is a change to change values
				.setContent("content")
				.setDelivered(true)
				.setMessageType(MessageType.VIDEO)
				.build();
		System.out.println(message.getContent());
		

	}

}
