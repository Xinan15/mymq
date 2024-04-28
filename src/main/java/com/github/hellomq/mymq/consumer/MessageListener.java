package com.github.hellomq.mymq.consumer;

import com.github.hellomq.mymq.Message;
import com.github.hellomq.mymq.consumer.retry.RetryableMessageException;

public interface MessageListener<T> {

    void onMessage(Message<T> message) throws RetryableMessageException;
}
