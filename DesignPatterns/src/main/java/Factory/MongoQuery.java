package Factory;

public class MongoQuery implements IQuery {

    @Override
    public String getQuery() {
        return "Mongo Database Query";
    }
}
