package com.epam.patterns.lsp;

import org.junit.Test;

import java.util.HashSet;

import static com.epam.patterns.lsp.DatabaseGateway.WRITE_TO_DATABASE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestGenericUser {

    @Test
    public void shouldNotGetValueOfAccessRightWhenRightIsProtected() {
        HashSet<String> protectedRights = new HashSet<>();
        protectedRights.add(WRITE_TO_DATABASE);

        GenericUser genericUser = new GenericUser(protectedRights);
        genericUser.setUpAccessRight(WRITE_TO_DATABASE, true);

        assertFalse(genericUser.hasRight(WRITE_TO_DATABASE));
    }

    @Test
    public void shouldGetValueOfAccessRightWhenRightIsNotProtected() {
        final String CHANGE_IN_DATABASE = "change in database";

        GenericUser genericUser = new GenericUser(new HashSet<>());
        genericUser.setUpAccessRight(CHANGE_IN_DATABASE, true);

        assertTrue(genericUser.hasRight(CHANGE_IN_DATABASE));
    }

}
