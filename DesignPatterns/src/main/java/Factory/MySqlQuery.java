package Factory;

public class MySqlQuery implements IQuery {
    @Override
    public String getQuery() {
        return "MySql Database Query";
    }
}
