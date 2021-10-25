package com.epam.patterns.lsp;

class PowerUser extends BaseAbstractUser {

    @Override
    void setupAccessRight(String right, boolean value) {
        accessRights.put(right, value);
    }

}
