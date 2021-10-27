package com.epam.patterns.lsp;

import java.util.HashSet;
import java.util.Set;

class GenericUser extends AbstractUser {

    private final Set<String> protectedRights;

    GenericUser(HashSet<String> protectedRights) {
        this.protectedRights = protectedRights;
    }

    @Override
    void setupAccessRight(String right, boolean value) {
        if (canBeAdded(right)) {
            addRight(right, value);
        }
    }

    private boolean canBeAdded(String right) {
        return !protectedRights.contains(right);
    }
}
