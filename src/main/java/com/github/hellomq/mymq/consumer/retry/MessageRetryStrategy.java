package com.github.hellomq.mymq.consumer.retry;

import com.github.hellomq.mymq.Message;
import com.github.hellomq.mymq.MessageQueue;

public interface MessageRetryStrategy<T> {

    void retry(Message<T> message, MessageQueue queue, String consumerId);
}
