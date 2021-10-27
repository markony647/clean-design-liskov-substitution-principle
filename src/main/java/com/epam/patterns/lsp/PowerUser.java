package com.epam.patterns.lsp;

class PowerUser extends AbstractUser {

    @Override
    void setupAccessRight(String right, boolean value) {
        addRight(right, value);
    }

}
