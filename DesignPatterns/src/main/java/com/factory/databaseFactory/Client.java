package com.factory.databaseFactory;

public class Client {
    public static void main(String[] args) {
        IDatabase database = new MySQlDatabase();
        database = new MongoDatabase();

        database.createDatabaseConnection();
       IQuery query = database.createDatabaseQuery();
       System.out.println(query.getQuery());
        database.refresh();
    }
}
