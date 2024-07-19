package com.factory.databaseFactory;

public class MongoDatabase implements IDatabase {
    @Override
    public IQuery createDatabaseQuery() {
        return new MongoQuery();
    }

    @Override
    public void refresh() {
        System.out.println("Refresh Mongo Database");
    }

    @Override
    public void createDatabaseConnection() {
        System.out.println("Create Mongo Database Connection");
    }
}
