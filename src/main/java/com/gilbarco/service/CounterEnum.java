package com.gilbarco.service;

public enum CounterEnum {
	 INSTANCE;
	int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
