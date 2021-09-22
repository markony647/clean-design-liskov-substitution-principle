package com.epam.patterns.lsp;

import java.util.HashMap;
import java.util.Map;

class PowerUser {
    Map<String, Boolean> accessRights = new HashMap<>();

    void setupAccessRight(String right, boolean value) {
        accessRights.put(right, value);
    }

    boolean getValueOfAccessRight(String right) {
        return accessRights.getOrDefault(right, false);
    }

}
