package Factory.DatabaseFactory;

public interface IDatabase {
    IQuery createDatabaseQuery();
    public void refresh();
    public void createDatabaseConnection();
}
