package com.epam.patterns.lsp;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseAbstractUser {
    final Map<String, Boolean> accessRights;

    public BaseAbstractUser() {
        accessRights = new HashMap<>();
    }

    abstract void setupAccessRight(String right, boolean value);

    public boolean hasRight(String right) {
        return accessRights.getOrDefault(right, false);
    }
}
