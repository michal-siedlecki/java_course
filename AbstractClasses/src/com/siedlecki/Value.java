package com.siedlecki;

public abstract class Value {
    private String value;

    public Value(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
