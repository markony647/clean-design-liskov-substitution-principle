package com.epam.patterns.lsp;

import java.util.HashSet;
import java.util.Set;

class GenericUser extends BaseAbstractUser {

    private final Set<String> protectedRights;

    GenericUser(HashSet<String> protectedRights) {
        this.protectedRights = protectedRights;
    }

    @Override
    void setupAccessRight(String right, boolean value) {
        if (canBeAdded(right)) {
            add(right, value);
        }
    }

    private boolean canBeAdded(String right) {
        return !protectedRights.contains(right);
    }

    private void add(String right, boolean value) {
        accessRights.put(right, value);
    }
}
