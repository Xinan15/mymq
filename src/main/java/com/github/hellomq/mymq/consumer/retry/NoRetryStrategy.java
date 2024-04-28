package com.github.hellomq.mymq.consumer.retry;

import com.github.hellomq.mymq.Message;
import com.github.hellomq.mymq.MessageQueue;

public class NoRetryStrategy<T> implements MessageRetryStrategy<T> {

    public void retry(Message<T> message, MessageQueue queue, String consumerId) {
        /* no-op */
    }
}
