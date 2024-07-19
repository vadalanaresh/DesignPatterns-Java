package com.factory.databaseFactory;

public interface IDatabase {
    IQuery createDatabaseQuery();
    public void refresh();
    public void createDatabaseConnection();
}
