package com.github.hellomq.mymq.consumer;

/**
 * Called by the QueueDequeueStrategy when a message has been dequeued from the queue and is ready to be processed.
 */
public interface MessageCallback {

    void handle(String messageId);
}
