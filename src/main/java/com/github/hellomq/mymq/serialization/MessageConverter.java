package com.github.hellomq.mymq.serialization;

import com.github.hellomq.mymq.Message;

import java.util.Map;

public interface MessageConverter {

    <T> Map<String, String> toMap(Message<T> message, PayloadSerializer payloadSerializer);

    <T> Message<T> toMessage(Map<String, String> data, Class<T> payloadType, PayloadSerializer payloadSerializer);
}
