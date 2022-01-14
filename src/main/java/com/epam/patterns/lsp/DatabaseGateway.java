package com.epam.patterns.lsp;

class DatabaseGateway {

    static final String WRITE_TO_DATABASE = "write to database";

    private static String database;

    static void writeToDBForce(AbstractUser user, String message) {
        user.setupAccessRight(WRITE_TO_DATABASE, true);
        writeToDB(user, message);
    }

    static void writeToDB(AbstractUser user, String message) {
        if (user.hasRight(WRITE_TO_DATABASE)) {
            database = message;
        }
    }

    static String readFromDB() {
        return database;
    }
}
