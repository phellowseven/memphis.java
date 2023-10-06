package dev.memphis.sdk;

import io.nats.client.Message;

import java.util.List;

public class MemphisMessage {
    private final Message message;
    private final String consumerGroup;

    public MemphisMessage(Message message, String consumerGroup) {
        this.message = message;
        this.consumerGroup = consumerGroup;
    }

    public byte[] getData() {
        return message.getData();
    }

    public List<String> getHeaders(String key) {
        return message.getHeaders().get(key);
    }

    public String getHeader(String key) {
        return message.getHeaders().getFirst(key);
    }

    public void ack() {
        message.ack();
    }
}
