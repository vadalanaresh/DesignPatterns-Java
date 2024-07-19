package com.builder.databaseConfiguration;

public class Client {
    public static void main(String[] args) {
        DatabaseConfigurationBuilder.Builder builder = DatabaseConfigurationBuilder.getBuilder();
        builder.setDatabaseUrl("test")
                .setMaxConnections(10)
                .setUsername("test")
                .setPassword("test")
                .setReadOnly(true)
                .setEnableCache(false)
                .build();

        System.out.println(builder);

    }
}
