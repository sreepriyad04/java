package designpatterns.builder.MessageProblem;


public class Message {

    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;
    
    public static MessageBuilder getBuilder() {
    	return new MessageBuilder();
    }

    public Message(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.isDelivered = isDelivered;
        this.timestamp = timestamp;
    }

    public Message(MessageBuilder messageBuilder) {
		// TODO Auto-generated constructor stub
    	this.messageType=messageBuilder.getMessageType();
    	this.content=messageBuilder.getContent();
    	this.sender=messageBuilder.getSender();
    	this.isDelivered=messageBuilder.isDelivered();
    	this.timestamp=messageBuilder.getTimestamp();
    	this.recipient=messageBuilder.getRecipient();
	}

	public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
