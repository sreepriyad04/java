package designpatterns.builder.builderconfiguration;

public class Client {
	public static void main(String[] args) {
		
		DatabaseConfiguration db=DatabaseConfiguration.getInstance()
				.setDatabaseUrl("sername:port")
				.setEnableCache(false)
				.build();
		System.out.println(db.getDatabaseUrl());
		
	}

}
