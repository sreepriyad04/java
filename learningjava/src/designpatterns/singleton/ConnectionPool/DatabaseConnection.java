package designpatterns.singleton.ConnectionPool;


public class DatabaseConnection {
	
	public static void main(String[] args) {
		
		ConnectionPoolImpl pool = ConnectionPoolImpl.getInstance(3);
		
		pool.initializePool();
		System.out.println("After initilizing pool "+pool.getAvailableConnectionsCount());
		System.out.println("After initilizing pool Total connections are "+pool.getTotalConnectionsCount());
		
		DatabaseConnection db = pool.getConnection();
		
		System.out.println("After getConnection "+pool.getAvailableConnectionsCount());
		System.out.println("After get Connection- Total connections are "+pool.getTotalConnectionsCount());
		
		pool.releaseConnection(db);
		
		System.out.println("After pool "+pool.getAvailableConnectionsCount());
		System.out.println("After pool Total connections are "+pool.getTotalConnectionsCount());
	}


}
