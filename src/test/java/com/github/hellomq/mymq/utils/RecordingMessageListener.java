package com.github.hellomq.mymq.utils;

import com.github.hellomq.mymq.Message;
import com.github.hellomq.mymq.consumer.MessageListener;
import com.github.hellomq.mymq.consumer.retry.RetryableMessageException;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecordingMessageListener implements MessageListener<String> {

    private LinkedList<Message<String>> recordedMessages = new LinkedList<Message<String>>();
    private boolean throwRetryException = false;

    public void onMessage(Message<String> message) throws RetryableMessageException {
        recordedMessages.add(message);

        if (throwRetryException) {
            throw new RetryableMessageException();
        }
    }

    public LinkedList<Message<String>> getRecordedMessages() {
        return recordedMessages;
    }

    public List<Message<String>> extractRecordedMessagesWithContent(String content) {
        List<Message<String>> result = new ArrayList<Message<String>>();
        for (Message<String> recordedMessage : recordedMessages) {
            if (StringUtils.equals(recordedMessage.getPayload(), content)) {
                result.add(recordedMessage);
            }
        }
        return result;
    }

    public void reset() {
        recordedMessages.clear();
    }

    public void setThrowRetryException(boolean throwRetryException) {
        this.throwRetryException = throwRetryException;
    }
}
