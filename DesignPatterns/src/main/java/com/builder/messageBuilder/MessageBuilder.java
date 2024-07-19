package com.builder.messageBuilder;


@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder(MBuilder builder) {
        this.messageType = builder.messageType;
        this.content = builder.content;
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
    }
    public static MBuilder getBuilder() {
        return new MBuilder();
    }
    public static class MBuilder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

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

        public MBuilder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }
        public MBuilder setContent(String content) {
            this.content = content;
            return this;
        }
        public MBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }
        public MBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
        public MBuilder setDelivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            return this;
        }
        public MBuilder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public MessageBuilder build() {
            return new MessageBuilder(this);
        }

        private MBuilder(){

        }
    }
}