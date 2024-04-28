package com.github.hellomq.mymq.producer;

import com.github.hellomq.mymq.Message;
import com.github.hellomq.mymq.MessageQueue;

public interface SubmissionStrategy {

    void submit(MessageQueue queue, Message<?> message);

    void submit(MessageQueue queue, Message<?> message, String consumer);
}
