package com.github.hellomq.mymq.serialization;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.data.redis.serializer.SerializationException;

import java.io.IOException;

public class JacksonPayloadSerializer implements PayloadSerializer {
    private ObjectMapper mapper = new ObjectMapper();

    public String serialize(Object payload) throws SerializationException {
        try {
            return mapper.writeValueAsString(payload);
        } catch (IOException e) {
            throw new SerializationException("Could not serialize object using Jackson.", e);
        }
    }

    public <T> T deserialize(String payload, Class<T> type) throws SerializationException {
        if (payload == null) {
            return null;
        }

        try {
            return mapper.readValue(payload, type);
        } catch (IOException e) {
            throw new SerializationException("Could not serialize object using Jackson.", e);
        }
    }
}
