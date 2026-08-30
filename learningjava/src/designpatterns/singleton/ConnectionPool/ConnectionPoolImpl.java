package designpatterns.singleton.ConnectionPool;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ConnectionPoolImpl implements ConnectionPool {
	
	private static ConnectionPoolImpl connectionPoolImpl;
	private int maxConnections;
	private Queue<DatabaseConnection> availableConnections;
	private Set<DatabaseConnection> usedConnections;

	
	private ConnectionPoolImpl(int maxConnections) {
		super();
		this.maxConnections=maxConnections;
		availableConnections=new LinkedList<>(); //We cannot use ArrayList because ArrayList implements List, while LinkedList implements both List and Queue.
		usedConnections = new HashSet<>();
	}
	
	
    @Override
    public void initializePool() {
    	for(int i=0; i<maxConnections;i++) {
    		//avaiableConnections.add(new DatabaseConnection());// if there is a failure while creating onject this method throw exception
    		availableConnections.offer(new DatabaseConnection());// this method doesnt throw exception
    	}

    }

    @Override
    public DatabaseConnection getConnection() {
    	if(availableConnections.isEmpty()) {
    		return null;
    	}
    		DatabaseConnection polledConnection = availableConnections.poll();
    	usedConnections.add(polledConnection);
		return polledConnection;
       
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
    	
    	if(!(usedConnections==null) && usedConnections.remove(connection))  //!(usedConnections.isEmpty()) && this statement will throw exception if the connection is empty
    		availableConnections.offer(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return availableConnections.size()+usedConnections.size();
    }
    
	public static ConnectionPoolImpl getInstance(int maxConnections) {
		if(connectionPoolImpl==null) {
			connectionPoolImpl= new ConnectionPoolImpl(maxConnections);
		}
		return connectionPoolImpl;
	}
	public static void resetInstance() {
		connectionPoolImpl = null;
		
	}
}