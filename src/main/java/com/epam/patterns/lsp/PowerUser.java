package com.epam.patterns.lsp;

class PowerUser extends BaseAbstractUser {

    @Override
    void setUpAccessRight(String right, boolean value) {
        accessRights.put(right, value);
    }

}
