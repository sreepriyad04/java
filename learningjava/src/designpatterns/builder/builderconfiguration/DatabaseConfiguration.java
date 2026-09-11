package designpatterns.builder.builderconfiguration;


public class DatabaseConfiguration {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;
    
    public static DatabaseConfigurationBuilder getInstance() {
    	return new DatabaseConfigurationBuilder();
    }

    public DatabaseConfiguration(String databaseUrl, String username, String password, int maxConnections, boolean enableCache, boolean isReadOnly) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
        this.maxConnections = maxConnections;
        this.enableCache = enableCache;
        this.isReadOnly = isReadOnly;
    }

    public DatabaseConfiguration(DatabaseConfigurationBuilder databaseConfigurationBuilder) {
		// TODO Auto-generated constructor stub
    	this.databaseUrl=databaseConfigurationBuilder.getDatabaseUrl();
    	this.enableCache=databaseConfigurationBuilder.isEnableCache();
    	this.isReadOnly=databaseConfigurationBuilder.isReadOnly();
    	this.maxConnections=databaseConfigurationBuilder.getMaxConnections();
    	this.password=databaseConfigurationBuilder.getPassword();
    	this.username=databaseConfigurationBuilder.getPassword();

	}

	public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }
}
