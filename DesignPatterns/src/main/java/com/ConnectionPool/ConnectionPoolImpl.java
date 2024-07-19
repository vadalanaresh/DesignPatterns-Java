package com.ConnectionPool;

public class ConnectionPoolImpl implements ConnectionPool {

    private ConnectionPoolImpl() {

    }

    private static ConnectionPool connectionPool = null;
    private static int _maxConnections;

    public static ConnectionPool getInstance(int maxConnections){
        if(connectionPool == null){
            synchronized (ConnectionPoolImpl.class){
                if(connectionPool == null){
                    _maxConnections = maxConnections;
                    connectionPool = new ConnectionPoolImpl();
                }
            }
        }
        return connectionPool;
    }

    public static void resetInstance(){
        connectionPool = null;
        _maxConnections = 0;
    }

    @Override
    public void initializePool() {
        
    }

    @Override
    public DatabaseConnection getConnection() {
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {

    }

    @Override
    public int getAvailableConnectionsCount() {
        return 0;
    }

    @Override
    public int getTotalConnectionsCount() {
        return 0;
    }
}
