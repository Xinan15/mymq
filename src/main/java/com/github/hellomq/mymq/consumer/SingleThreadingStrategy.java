package com.github.hellomq.mymq.consumer;

public class SingleThreadingStrategy extends MultiThreadingStrategy {

    public SingleThreadingStrategy() {
        super(1);
    }
}
