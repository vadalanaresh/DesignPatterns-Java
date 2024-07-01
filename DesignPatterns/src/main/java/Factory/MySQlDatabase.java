package Factory;

public class MySQlDatabase implements IDatabase {
    public void refresh(){
        System.out.println("Refresh MySql Database");
    }

    public void createDatabaseConnection(){
        System.out.println("Create MySql Database Connection");
    }

    @Override
    public IQuery createDatabaseQuery() {
        return new MySqlQuery();

    }
}
