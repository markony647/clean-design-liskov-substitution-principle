package com.epam.patterns.lsp;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractUser {
    private final Map<String, Boolean> rightByValue;

    public AbstractUser() {
        rightByValue = new HashMap<>();
    }

    abstract void setupAccessRight(String right, boolean value);

    public boolean hasRight(String right) {
        return rightByValue.getOrDefault(right, false);
    }

    public void addRight(String right, boolean value) {
        rightByValue.put(right, value);
    }
}
