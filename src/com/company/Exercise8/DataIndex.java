package com.company.Exercise8;

public enum DataIndex {
    FIRST_NAME (0), LAST_NAME (1), AGE (2);

    private final int value;

    DataIndex(int value) {
        this.value = value;
    }

    public int getValue() { return value; }
}
